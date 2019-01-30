package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Aluno {

    private String nome;
    private int idade;

    /**
     * Construtor.
     * @param nome 
     */
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
