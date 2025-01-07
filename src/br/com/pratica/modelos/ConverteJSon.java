package br.com.pratica.modelos;

import com.google.gson.Gson;

public class ConverteJSon {
    private Gson gson = new Gson();


    public String paraJson(Object obj) {

        if (obj instanceof Titulo) {
            System.out.printf("Título " + "{%s}" + " convertido para JSON:\n", ((Titulo) obj).getNome());
        }
        String retorno = gson.toJson(obj);
        return retorno;
    }
}
