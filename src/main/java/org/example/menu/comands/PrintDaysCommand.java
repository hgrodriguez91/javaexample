package org.example.menu.comands;

import menu.Command;
import org.example.service.ArrayService;

public class PrintDaysCommand implements Command {

    private final ArrayService arrayService;

    public PrintDaysCommand(ArrayService arrayService) {
        this.arrayService = arrayService;
    }
    @Override
    public void execute() {
        arrayService.printDias();
    }
}
