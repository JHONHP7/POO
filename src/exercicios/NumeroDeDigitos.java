package exercicios;

import java.util.Scanner;
public class NumeroDeDigitos {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        long numero = scanner.nextLong();

	        int numeroDigitos = String.valueOf(numero).length();

	        System.out.println("O número de dígitos é: " + numeroDigitos);

	        scanner.close();
	    }
	}

