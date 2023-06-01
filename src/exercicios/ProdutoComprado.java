package exercicios;

import java.util.Scanner;

public class ProdutoComprado{
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome, preço e quantidade do produto: ");
		String nome = entrada.nextLine();
		double preço = entrada.nextDouble();
		int quantidade = entrada.nextInt();
		
		if(quantidade <= 10 ) {
			String mensagem = String.format("O %s custará R$ %d.2f", nome, preço);
			System.out.println(mensagem);
		}else if(quantidade >10 && quantidade <=20){
			double preçoComDesconto = (preço*quantidade)-((preço*quantidade)*0.1);
			System.out.println("O "+nome+" custará: "+preçoComDesconto);
		}else if(quantidade > 20 && quantidade <=50) {
			double preçoComDesconto = (preço*quantidade)-((preço*quantidade)*0.2);
			System.out.println("O "+nome+" custará: "+preçoComDesconto);
		}else{
			double preçoComDesconto = (preço*quantidade)-((preço*quantidade)*0.25);
			System.out.println("O "+nome+" custará: "+preçoComDesconto);
		}
		entrada.close();
	}
	
}