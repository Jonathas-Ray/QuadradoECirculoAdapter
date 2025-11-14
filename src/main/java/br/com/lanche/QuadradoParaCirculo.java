package br.com.lanche;

public class QuadradoParaCirculo{
    private final double area;


    public QuadradoParaCirculo(double area) {
        this.area = area;
    }

    public double calcularRaio() {
        double raio = area/Math.PI;
        return raio = Math.sqrt(area);
    }


}
