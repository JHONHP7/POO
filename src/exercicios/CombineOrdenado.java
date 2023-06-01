package exercicios;

import java.util.Arrays;
import java.util.Random;

public class CombineOrdenado {
    public static void main(String[] args) {
        int[] vetor1 = gerarVetorAleatorio(50);
        int[] vetor2 = gerarVetorAleatorio(50);
        
        System.out.println("Vetor 1 original:");
        imprimirVetor(vetor1);
        
        System.out.println("Vetor 2 original:");
        imprimirVetor(vetor2);
        
        Arrays.sort(vetor1);
        Arrays.sort(vetor2);
        
        int[] vetorCombinado = combinarVetoresOrdenados(vetor1, vetor2);
        
        System.out.println("Vetor combinado ordenado:");
        imprimirVetor(vetorCombinado);
    }
    
    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        }
        
        return vetor;
    }
    
    public static int[] combinarVetoresOrdenados(int[] vetor1, int[] vetor2) {
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        int tamanhoCombinado = tamanho1 + tamanho2;
        
        int[] vetorCombinado = new int[tamanhoCombinado];
        
        int i = 0, j = 0, k = 0;
        
        while (i < tamanho1 && j < tamanho2) {
            if (vetor1[i] < vetor2[j]) {
                vetorCombinado[k] = vetor1[i];
                i++;
            } else {
                vetorCombinado[k] = vetor2[j];
                j++;
            }
            
            k++;
        }
        
        while (i < tamanho1) {
            vetorCombinado[k] = vetor1[i];
            i++;
            k++;
        }
        
        while (j < tamanho2) {
            vetorCombinado[k] = vetor2[j];
            j++;
            k++;
        }
        
        return vetorCombinado;
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
