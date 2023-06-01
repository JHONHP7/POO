package exercicios;

import java.util.Scanner;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = lerNumero(scanner);
        String numeroExtenso = escreverPorExtenso(numero);
        
        System.out.println("Número por extenso: " + numeroExtenso);
        
        scanner.close();
    }
    
    public static int lerNumero(Scanner scanner) {
        System.out.println("Informe um número de até 9 dígitos:");
        return scanner.nextInt();
    }
    
    public static String escreverPorExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenas = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        String[] especiais = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        
        if (numero == 0) {
            return unidades[numero];
        }
        
        String numeroExtenso = "";
        
        if (numero >= 1000000000) {
            int bilhoes = numero / 1000000000;
            numeroExtenso += escreverPorExtenso(bilhoes) + " bilhão ";
            numero %= 1000000000;
        }
        
        if (numero >= 1000000) {
            int milhoes = numero / 1000000;
            numeroExtenso += escreverPorExtenso(milhoes) + " milhão ";
            numero %= 1000000;
        }
        
        if (numero >= 1000) {
            int milhares = numero / 1000;
            numeroExtenso += escreverPorExtenso(milhares) + " mil ";
            numero %= 1000;
        }
        
        if (numero >= 100) {
            int centena = numero / 100;
            numeroExtenso += centenas[centena] + " ";
            numero %= 100;
        }
        
        if (numero >= 10 && numero <= 19) {
            numeroExtenso += especiais[numero % 10] + " ";
        } else {
            if (numero >= 20) {
                int dezena = numero / 10;
                numeroExtenso += dezenas[dezena] + " ";
                numero %= 10;
            }
            
            if (numero > 0) {
                numeroExtenso += unidades[numero] + " ";
            }
        }
        
        return numeroExtenso.trim();
    }
}
