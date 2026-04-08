package org.example.menu.comands;

import menu.Command;
import org.example.service.StringService;

import java.util.Scanner;

public class ReverseTextCommand implements Command {

    private final StringService service;
    private final Scanner scanner;

    private static final  String DEFAULT_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

    public ReverseTextCommand(StringService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Texto default: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit' ");
        System.out.print("Ingrese el texto o presione enter para usar texto predeterminado: ");
        String text = scanner.nextLine();
        if(text == null || text.isBlank()){
            text = DEFAULT_TEXT;
        }
        String reverseText = service.invertir(text);
        System.out.print(reverseText);
        System.out.println();
    }
}
