package br.com.pratica.principal;

import br.com.pratica.modelos.Titulo;
import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new Gson();

        Titulo titulo1 = new Titulo("Django", "Scorcese", 60);

        String tituloJSON = gson.toJson(titulo1);
        System.out.println(tituloJSON);


    }
}
