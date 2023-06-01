package exercicios;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe as notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        
        double media = calcularMedia(nota1, nota2, nota3);
        String status = obterStatus(media);
        System.out.println("A média do aluno: " + media);
        System.out.println("Status do aluno: " + status);
        
        scanner.close();
    }
    
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    public static String obterStatus(double media) {
        if (media > 6.0) {
            return "Aprovado";
        } else if (media >= 4.0 && media <= 6.0) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }
}
