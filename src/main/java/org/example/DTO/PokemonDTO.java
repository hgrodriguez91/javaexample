package org.example.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDTO {
    private int id;
    private String name;
    private int height;
    private int weight;

    private List<TypeWrapper> types;
    private List<AbilityWrapper> abilities;

    @JsonProperty("sprites")
    private Sprites sprites;


    public List<String> getTypes() {
        return types.stream()
                .map(t -> t.type.name)
                .collect(Collectors.toList());
    }

    public List<String> getAbilities() {
        return abilities.stream()
                .map(a -> a.ability.name)
                .collect(Collectors.toList());
    }

    public String getImage() {
        return sprites.front_default;
    }

    // 🔹 Clases internas

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeWrapper {
        public Type type;
    }

    public static class Type {
        public String name;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityWrapper {
        public Ability ability;
    }

    public static class Ability {
        public String name;
        public String url;
    }

    public static class Sprites {
        public String front_default;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }

    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public String toString() {
        return "PokemonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", types=" + getTypes() +
                ", abilities=" + getAbilities() +
                ", image='" + getImage() + '\'' +
                '}';
    }
}
