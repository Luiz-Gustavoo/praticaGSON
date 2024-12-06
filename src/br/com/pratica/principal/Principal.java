package br.com.pratica.principal;

import br.com.pratica.modelos.Editora;
import br.com.pratica.modelos.Livro;
import br.com.pratica.modelos.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        String json = "{ \"Nome\": \"João\", \"Cidade\": \"Apucarana\", \"Cdade\": 30}";

        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa1);
        String nome = pessoa1.nome();
        String cidade = pessoa1.cidade();
        int idade = pessoa1.idade();

        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(idade);

        Pessoa pessoa2 = new Pessoa("Luiz", "Apucarana", 22);

        String json2 = gson.toJson(pessoa2);
        System.out.println(json2);

        System.out.println("----------------------------------------------");

        Editora editora = new Editora("Rocco");
        Livro livro1 = new Livro("Fogo e sangue", "GRR Martin", editora);

        String livro1JSON = gson.toJson(livro1);
        System.out.println(livro1JSON);


    }
}
