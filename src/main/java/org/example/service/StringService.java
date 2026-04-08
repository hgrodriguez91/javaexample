package org.example.service;

public class StringService {

    public String invertirCadena(String texto) {
        if (texto == null) return null;
        return new StringBuilder(texto).reverse().toString();
    }

    public static void imprimirPiramide(int niveles){
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
