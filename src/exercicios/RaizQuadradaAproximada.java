package exercicios;

import java.util.Scanner;

public class RaizQuadradaAproximada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número inteiro: ");
        int numero = teclado.nextInt();

        System.out.print("Informe o erro máximo desejado: ");
        double erroMaximo = teclado.nextDouble();

        double raizAproximada = calcularRaizQuadradaAproximada(numero, erroMaximo);

        System.out.println("A raiz quadrada aproximada de " + numero + " é: " + raizAproximada);

        teclado.close();
    }

    public static double calcularRaizQuadradaAproximada(int numero, double erroMaximo) {
        double raizAtual = 1.0;
        double raizAnterior;

        do {
            raizAnterior = raizAtual;
            raizAtual = (raizAnterior + numero / raizAnterior) / 2;
        } while (Math.abs(raizAtual - raizAnterior) > erroMaximo);

        return raizAtual;
    }
}
