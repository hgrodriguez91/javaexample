package org.example.menu.comands;

import menu.Command;
import org.example.service.PokeApiService;

import java.util.Scanner;

public class PokemonCommand implements Command {

    private final PokeApiService service;
    private final Scanner scanner;

    public PokemonCommand(PokeApiService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Nombre del Pokémon: ");
        String nombre = scanner.nextLine();

        service.buscarPokemon(nombre);
        System.out.println();
    }
}
