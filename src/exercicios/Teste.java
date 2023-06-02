package exercicios;

import java.util.Scanner;

public class Teste {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int quantidade;
		double preço;
		System.out.println("Entre com Nome, quantidade e preço: ");
		nome = teclado.nextLine();
		quantidade = teclado.nextInt();
		preço = teclado.nextDouble();
		
		if(quantidade <= 10 ) {
			System.out.println("O preço final é = "+preço*quantidade);
		}else if(quantidade >10 && quantidade <=20) {
			double preçoFinal = Desconto(quantidade,preço,10);
			System.out.println("O preço final do produto "+nome+" = "+preçoFinal);
		}else if(quantidade > 20 && quantidade <=50) {
			double preçoFinal = Desconto(quantidade,preço,20);
			System.out.println("O preço final do produto "+nome+" = "+preçoFinal);
		}else {
			double preçoFinal = Desconto(quantidade,preço,25);
			System.out.println("O preço final do produto "+nome+" = "+preçoFinal);
		}
		
		teclado.close();
		
	}
	
	
	public static double Desconto(int quantidade, double preço, double porcentagem) {
		double valorTotal = (preço*quantidade)-((preço*quantidade)*(porcentagem/100));
		return valorTotal;
	}
}