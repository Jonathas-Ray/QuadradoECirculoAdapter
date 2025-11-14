package br.com.lanche;

public class Quadrado implements FormaGeometrica {
    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * lado;
    }
}
