package br.com.lanche;

public class Circulo implements FormaGeometrica{
    private double raio;
    private double area;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        this.area = Math.PI * this.raio * this.raio;
        return area;
    }
}

//quero criar um circulo a partir dum quadrado
