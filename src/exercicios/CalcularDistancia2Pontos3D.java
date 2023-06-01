package exercicios;

import java.util.Scanner;

public class CalcularDistancia2Pontos3D {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do primeiro ponto!");
		System.out.println("Digite o valor de x: ");
		double x = scanner.nextDouble();
		System.out.println("Digite o valor de y: ");
		double y = scanner.nextDouble();
		System.out.println("Digite o valor de z: ");
		double z = scanner.nextDouble();
		
		System.out.println("Digite as coordenadas do primeiro ponto!");
		System.out.println("Digite o valor de x1: ");
		double x1 = scanner.nextDouble();
		System.out.println("Digite o valor de y1: ");
		double y1 = scanner.nextDouble();
		System.out.println("Digite o valor de z1: ");
		double z1 = scanner.nextDouble();
		
		//USANDO a FÓRMULA d = √((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)
		
		double distancia = calcularDistancia3D(x, y, z, x1, y1, z1);
//		String resultado = String.format("%.2f", distancia);
//		System.out.println("A distância entre os dois pontos é de: "+resultado);
		String mensagem = String.format("A distância entre os ponto é %.2f!", distancia);
		System.out.println(mensagem);
		
		scanner.close();
	}
	
	public static double calcularDistancia3D(double x, double y, double z, double x1, double y1, double z1) {
		double distancia = Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2)+Math.pow(z1-z,2));
		return distancia;
	}
	
}
