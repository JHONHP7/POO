package exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = teclado.nextInt();

        System.out.println("A série de Fibonacci até o número " + numero + " é:");
        for (int i = 0; i <= numero; i++) {
            int resultado = fibonacci(i);
            System.out.print(resultado + " ");
        }

        teclado.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
