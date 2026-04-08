package org.example.menu.comands;

import menu.Command;
import org.example.service.MathService;

import java.util.Scanner;

public class AreaCommand implements Command {

    private final MathService mathService;
    private final Scanner scanner;

    public AreaCommand(MathService mathService, Scanner scanner) {
        this.mathService = mathService;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Base: ");
        double base = scanner.nextDouble();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Área: " + mathService.calcularArea(base, altura));
    }
}
