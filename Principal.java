import java.util.List;
import java.util.ArrayList;

/**
 * Representa uma pessoa com nome e idade.
 */
class Pessoa {
    private String nome;
    private int idade;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome  O nome da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Retorna uma representação em string da pessoa.
     *
     * @return Uma string formatada com o nome e a idade da pessoa.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

/**
 * Classe principal que contém o método main.
 */
public class Principal {
    public static void main(String[] args) {
        // Criando a lista de pessoas
        List<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando pessoas à lista
        listaDePessoas.add(new Pessoa("João", 25));
        listaDePessoas.add(new Pessoa("Maria", 30));
        listaDePessoas.add(new Pessoa("Carlos", 22));

        // Imprimindo informações sobre a lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista, se existir
        if (!listaDePessoas.isEmpty()) {
            Pessoa primeiraPessoa = listaDePessoas.get(0);
            System.out.println("Primeira pessoa da lista: " + primeiraPessoa);
        } else {
            System.out.println("A lista está vazia.");
        }

        // Imprimindo a lista completa
        System.out.println("Lista completa:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
