package org.example.service;

public class MathService {

    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) System.out.print(",");
        }
        System.out.println();
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}
