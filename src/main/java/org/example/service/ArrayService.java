package org.example.service;

public class ArrayService {

    private final String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
    };

    public void printDias() {
        System.out.println("Lunes a viernes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i]);
        }

        System.out.println("\nReversa:");
        for (int i = dias.length - 1; i >= 0; i--) {
            System.out.println(dias[i]);
        }
    }
}
