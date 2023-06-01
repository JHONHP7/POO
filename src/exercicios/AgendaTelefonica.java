package exercicios;

import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public List<Contato> buscarContatos(String termo) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().contains(termo.toLowerCase()) || contato.getTelefone().contains(termo)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}

public class AgendaTelefonica {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("Maria", "987654321");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        List<Contato> contatos = agenda.getContatos();
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }

        String termoBusca = "mar";
        List<Contato> contatosEncontrados = agenda.buscarContatos(termoBusca);
        System.out.println("Contatos encontrados para '" + termoBusca + "':");
        for (Contato contato : contatosEncontrados) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }
}
