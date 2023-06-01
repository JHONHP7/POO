package exercicios;

import java.util.List;
import java.util.ArrayList;

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



