package exercicios;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tempoSegundos = lerTempo(scanner);
        
        int horas = obterHoras(tempoSegundos);
        int minutos = obterMinutos(tempoSegundos);
        int segundos = obterSegundos(tempoSegundos);
        
        escreverTempo(horas, minutos, segundos);
        
        scanner.close();
    }
    
    public static int lerTempo(Scanner scanner) {
        System.out.println("Informe o tempo em segundos:");
        return scanner.nextInt();
    }
    
    public static int obterHoras(int tempoSegundos) {
        return tempoSegundos / 3600;
    }
    
    public static int obterMinutos(int tempoSegundos) {
        return (tempoSegundos % 3600) / 60;
    }
    
    public static int obterSegundos(int tempoSegundos) {
        return tempoSegundos % 60;
    }
    
    public static void escreverTempo(int horas, int minutos, int segundos) {
        System.out.println("Tempo convertido:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
