package br.com.pratica.modelos;

public class Veiculo {
    private String nome;
    private String marca;

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Veiculo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;

    }
}
