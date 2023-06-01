package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	public static void main(String[]args) {
		        // Criando alguns produtos
		        Produto arroz = new Produto("Arroz", 10.0, 50);
		        Produto feijao = new Produto("Feijão", 8.0, 40);
		        System.err.println(arroz.getNome());

		        // Criando itens de pedido
		        ItemPedido item1 = new ItemPedido(arroz, 2);
		        ItemPedido item2 = new ItemPedido(feijao, 3);

		        // Criando um pedido
		        List<ItemPedido> itensPedido = new ArrayList<>();
		        itensPedido.add(item1);
		        itensPedido.add(item2);
		        Pedido pedido = new Pedido(itensPedido, "cartão");

		        // Criando o supermercado
		        Supermercado supermercado = new Supermercado();

		        // Adicionando produtos ao supermercado
		        supermercado.adicionarProduto(arroz);
		        supermercado.adicionarProduto(feijao);

		        // Atualizando o estoque após a venda do pedido
		        supermercado.atualizarEstoque(pedido);
		    }

	}
