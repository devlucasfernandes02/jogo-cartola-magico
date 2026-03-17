package model;

public class Jogador {
    private String nome;
    private int tentativas;

    public Jogador(String nome, int tentativas) {
        this.nome = nome;
        this.tentativas = tentativas;
    }

    public String getNome() {
        return nome;
    }

    public int getTentativas() {
        return tentativas;
    }
}