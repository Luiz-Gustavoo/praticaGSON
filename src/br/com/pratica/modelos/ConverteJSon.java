package br.com.pratica.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverteJSon {
    private Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();


    public String paraJson(Object obj) {

        if (obj instanceof Titulo) {
            System.out.printf("Título " + "{%s}" + " convertido para JSON:\n", ((Titulo) obj).getNome());
        }
        String retorno = gson.toJson(obj);
        return retorno;
    }
}
