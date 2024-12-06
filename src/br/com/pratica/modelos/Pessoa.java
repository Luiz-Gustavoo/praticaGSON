package br.com.pratica.modelos;

public record Pessoa(String nome, String cidade, int idade) {

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\n" +
                "Cidade: " + cidade +
                "\n" +
                "Idade: " + idade;
    }
}
