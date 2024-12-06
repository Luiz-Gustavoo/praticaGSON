package br.com.pratica.principal;

import br.com.pratica.modelos.Editora;
import br.com.pratica.modelos.Livro;
import br.com.pratica.modelos.Pessoa;
import com.google.gson.Gson;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new Gson();

        System.out.println("DE JSON PARA PESSOA");
        String jsonPessoa1 = "{ \"nome\": \"João\", " +
                            "\"cidade\": \"Apucarana\", " +
                            "\"idade\": 30}";

        Pessoa pessoa1 = gson.fromJson(jsonPessoa1, Pessoa.class);
        System.out.println(pessoa1);

        System.out.println("\nDE PESSOA PARA JSON");
        Pessoa pessoa2 = new Pessoa("Luiz", "Apucarana", 22);

        String jsonPessoa2 = gson.toJson(pessoa2);
        System.out.println(jsonPessoa2);

        System.out.println("\n----------------------------------------------\n");

        System.out.println("DE LIVRO PARA JSON");
        Editora editora = new Editora("Rocco");
        Livro livro1 = new Livro("Fogo e sangue", "GRR Martin", editora);

        String jsonLivro1 = gson.toJson(livro1);
        System.out.println(jsonLivro1);


        System.out.println("\nDE JSON PARA LIVRO");
        String jsonLivro2 = "{\"titulo\": \"Harry Potter\", " +
                            "\"autor\": \"JK Rowling\", " +
                            "\"editora\": {\"nome\": \"Rocco\"}}";

        Livro livro2 = gson.fromJson(jsonLivro2, Livro.class);
        System.out.println(livro2);
    }
}
