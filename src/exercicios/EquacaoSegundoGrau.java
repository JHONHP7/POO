package exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		
		double b = scanner.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		
		double c = scanner.nextDouble();
		
		double delta = (b*b) - 4*a*c;
		
		if(delta > 0) {
			double raiz1 = (-b + Math.sqrt(delta))/2*a;
			double raiz2 = (-b - Math.sqrt(delta))/2*a;
			System.out.println("As raízes da equação são "+raiz1+" e "+ raiz2);
		}else if(delta == 0){
			double raiz = (-b /(2 * a));
			System.out.println("A raizda equação é "+raiz);
		}else {
			System.out.println("A equação são possui raízes reais!");
		}
		scanner.close();
	}

}
