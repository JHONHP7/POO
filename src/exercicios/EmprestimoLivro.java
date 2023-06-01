package exercicios;

import java.util.Date;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}

class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private Date dataEmprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = new Date();
        livro.setEmprestado(true);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
}

public class EmprestimoLivro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes");

        Emprestimo emprestimo = new Emprestimo(pessoa, livro);

        System.out.println("Empréstimo realizado:");
        System.out.println("Pessoa: " + emprestimo.getPessoa().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor());
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Livro emprestado: " + emprestimo.getLivro().isEmprestado());
    }
}
