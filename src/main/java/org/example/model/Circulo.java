package org.example.model;

public class Circulo implements Figura{

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
