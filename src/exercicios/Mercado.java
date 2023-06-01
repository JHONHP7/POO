package exercicios;

import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

class Pedido {
    private List<ItemPedido> itens;
    private String metodoPagamento;

    public Pedido(List<ItemPedido> itens, String metodoPagamento) {
        this.itens = itens;
        this.metodoPagamento = metodoPagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }
}

class Supermercado {
    private List<Produto> produtos;

    public Supermercado() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Pedido fazerPedido(List<ItemPedido> itens, String metodoPagamento) {
        return new Pedido(itens, metodoPagamento);
    }

    public void atualizarEstoque(Pedido pedido) {
        for (ItemPedido item : pedido.getItens()) {
            Produto produto = item.getProduto();
            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - item.getQuantidade());
        }
    }
}

public class Mercado {
    public static void main(String[] args) {
        // Criando alguns produtos
        Produto arroz = new Produto("Arroz", 10.0, 50);
        Produto feijao = new Produto("Feijão", 8.0, 40);

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
