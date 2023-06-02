package exercicios;

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        int[] vetor = gerarVetorAleatorio(100);
        
        System.out.println("Vetor original:");
        imprimirVetor(vetor);
        
        ordenarVetor(vetor);
        
        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
        System.out.println(vetor.length);
        //int numero = 34234;
        //System.out.println(String.valueOf(numero).length());
    }
    
    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        }
        
        return vetor;
    }
    
    public static void ordenarVetor(int[] vetor) {
        int tamanho = vetor.length;
        
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMinimo = i;
            
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            int temp = vetor[i];
            vetor[i] = vetor[indiceMinimo];
            vetor[indiceMinimo] = temp;
        }
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
