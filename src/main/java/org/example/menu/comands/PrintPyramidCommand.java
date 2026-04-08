package org.example.menu.comands;

import menu.Command;
import org.example.service.StringService;

import java.util.Scanner;

public class PrintPyramidCommand implements Command {

    private final StringService service;
    private final Scanner scanner;

    public PrintPyramidCommand(StringService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }


    @Override
    public void execute() {
        System.out.print("Escriba un numero: ");
        int level = scanner.nextInt();
        StringService.imprimirPiramide(level);
    }
}
