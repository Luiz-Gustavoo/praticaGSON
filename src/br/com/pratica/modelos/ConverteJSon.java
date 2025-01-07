package br.com.pratica.modelos;

import com.google.gson.Gson;

public class ConverteJSon {
    private Gson gson = new Gson();


    public String paraJson(Object obj) {
        String retorno = gson.toJson(obj);
        return retorno;
    }
}
