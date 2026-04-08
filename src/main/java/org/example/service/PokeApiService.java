package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.DTO.PokemonDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApiService {

    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public void buscarPokemon(String nombre) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL + nombre.toLowerCase()))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() == 200) {

                ObjectMapper mapper = new ObjectMapper().configure(
                        com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false
                );;
                PokemonDTO dto = mapper.readValue(response.body(), PokemonDTO.class);
                System.out.println("Respuesta:");
                System.out.println(dto);
            } else {
                System.out.println("Pokémon no encontrado");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
