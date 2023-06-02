package exercicios;

import java.util.Random;

public class Teste3 {
public static void main(String[] args) {
	int[] vetor = new int[100];
	Random random = new Random();
	for(int i = 0; i< 100; i++) {
		vetor[i] = random.nextInt(100);
		System.out.printf("%d ",vetor[i]);
	}
	System.out.println("\n"+vetor.length);
	}
}