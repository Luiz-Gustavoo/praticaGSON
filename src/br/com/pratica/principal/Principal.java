package br.com.pratica.principal;

import br.com.pratica.modelos.Pessoa;
import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = "{ \"Nome\": \"João\", \"cidade\": \"Apucarana\", \"idade\": 30}";

        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);

        String nome = pessoa1.nome();
        String cidade = pessoa1.cidade();
        int idade = pessoa1.idade();

        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(idade);

        Pessoa pessoa2 = new Pessoa("Luiz", "Apucarana", 22);

        String json2 = gson.toJson(pessoa2);
        System.out.println(json2);


    }
}
