package exercicios;

import java.util.Scanner;

public class DecimalParaRomano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroDecimal = lerNumeroDecimal(scanner);
        String numeroRomano = converterParaRomano(numeroDecimal);
        
        System.out.println("Número Romano: " + numeroRomano);
        
        scanner.close();
    }
    
    public static int lerNumeroDecimal(Scanner scanner) {
        System.out.println("Informe um número decimal de até 3 dígitos:");
        return scanner.nextInt();
    }
    
    public static String converterParaRomano(int numeroDecimal) {
        String[] romanosUnidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] romanosDezenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanosCentenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        
        int unidades = numeroDecimal % 10;
        int dezenas = (numeroDecimal / 10) % 10;
        int centenas = (numeroDecimal / 100) % 10;
        
        String romanoUnidades = romanosUnidades[unidades];
        String romanoDezenas = romanosDezenas[dezenas];
        String romanoCentenas = romanosCentenas[centenas];
        
        return romanoCentenas + romanoDezenas + romanoUnidades;
    }
}
