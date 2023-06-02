package exercicios;

import java.util.Scanner;

public class MenorQuantidadeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em centavos: ");
        int valorCentavos = scanner.nextInt();

        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] quantidadeMoedas = new int[moedas.length];

        for (int i = 0; i < moedas.length; i++) {
            quantidadeMoedas[i] = valorCentavos / moedas[i];
            valorCentavos %= moedas[i];
        }

        System.out.println("Menor quantidade de moedas:");
        for (int i = 0; i < moedas.length; i++) {
            if (quantidadeMoedas[i] > 0) {
                System.out.println(quantidadeMoedas[i] + " moeda(s) de " + moedas[i] + " centavos");
            }
        }
    }
}
