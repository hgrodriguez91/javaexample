package org.example.menu.comands;

import menu.Command;
import org.example.service.MathService;

public class PrintNumbersCommand implements Command {

    private final MathService mathService;

    public PrintNumbersCommand(MathService mathService) {
        this.mathService = mathService;
    }

    @Override
    public void execute() {
        mathService.printNumbers();
    }
}
