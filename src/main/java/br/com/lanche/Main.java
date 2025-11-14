package br.com.lanche;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // X
        // API
        // DLL
        // SDK
        // Framework
        Quadrado quadrado = new Quadrado(24);

        //
        QuadradoParaCirculo quadradoParaCirculo = new QuadradoParaCirculo(quadrado.calcularArea());

        // Y
        Circulo circulo = new Circulo(quadradoParaCirculo.calcularRaio());

    }
}

/* Nota
Confundi como seria a aplicação nessa situação e fiz uma engenharia reversa da area de um pra achar o raio
que dá área equivalente à do quadrado e não fiz uso da referência.
 */