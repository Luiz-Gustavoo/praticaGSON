package br.com.pratica.modelos;

public class Titulo {
    private String nome;
    private String diretor;
    private int duracaoMinutos;

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public Titulo(String nome, String diretor, int duracaoMinutos) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;


    }

    @Override
    public String toString() {
        return "Nome: " + nome +
        "\n" + "Diretor: " + diretor +
        "\n" + "Duração em minutos: " + duracaoMinutos;
    }
}
