package org.example.menu;


import org.example.menu.comands.*;
import org.example.service.ArrayService;
import org.example.service.MathService;
import org.example.service.PokeApiService;
import org.example.service.StringService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<Integer, menu.Command> comandos = new HashMap<>();

    public MenuHandler() {

        MathService mathService = new MathService();
        StringService stringService = new StringService();
        ArrayService arrayService = new ArrayService();
        PokeApiService pokeService = new PokeApiService();

        comandos.put(1, new PrintNumbersCommand(mathService));
        comandos.put(2, new AreaCommand(mathService, scanner));
        comandos.put(3, new PrintDaysCommand(arrayService));
        comandos.put(4, new ReverseTextCommand(stringService, scanner));
        comandos.put(5, new PrintPyramidCommand(stringService, scanner));
        comandos.put(6, new OddNumberCommand(mathService, scanner));
        comandos.put(7, new PokemonCommand(pokeService, scanner));

    }

    public void start() {
        int opcion;

        do {
            printMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            menu.Command command = comandos.get(opcion);

            if (command != null) {
                command.execute();
            } else if (opcion != 0) {
                System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    private void printMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Imprimir números");
        System.out.println("2. Calcular área");
        System.out.println("3. Imprimir días de la semana");
        System.out.println("4. Invertir texto");
        System.out.println("5. Imprimir piramide");
        System.out.println("6. Determinar paridad de un número");
        System.out.println("7. Buscar Pokémon");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }
}
