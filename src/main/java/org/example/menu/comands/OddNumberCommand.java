package org.example.menu.comands;

import menu.Command;
import org.example.service.MathService;

import java.util.Scanner;

public class OddNumberCommand implements Command {

    private final MathService mathService;
    private final Scanner scanner;

    public OddNumberCommand(MathService mathService, Scanner scanner) {
        this.mathService = mathService;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Escriba un numero: ");
        int number = scanner.nextInt();
        boolean isOdd = mathService.esPar(number);
        System.out.print(isOdd ? "El número es par": "El número es impar");
        System.out.println();
    }
}
