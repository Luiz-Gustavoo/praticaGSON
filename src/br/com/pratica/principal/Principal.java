package br.com.pratica.principal;

import br.com.pratica.modelos.ConverteJSon;
import br.com.pratica.modelos.Titulo;
import br.com.pratica.modelos.Veiculo;

public class Principal {
    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("Django", "Scorcese", 60);

        ConverteJSon gson =  new ConverteJSon();
        System.out.println(gson.paraJson(titulo1));

        Veiculo veiculo1 = new Veiculo("Corolla", "Toyota");
        System.out.println(gson.paraJson(veiculo1));

    }
}
