package br.com.pratica.modelos;

import com.google.gson.Gson;

public class ConverteJSon {
    private Gson gson = new Gson();


    public String paraJson(Object obj) {

        if (obj instanceof Titulo) {
            System.out.println("Título " + ((Titulo) obj).getNome() + " convertido para JSON:");
        }
        String retorno = gson.toJson(obj);
        return retorno;
    }
}
