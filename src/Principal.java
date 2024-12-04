import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = "{\"nome\": \"joão\", " +
                        "\"cidade\": \"Apucarana\", " +
                        "\"idade\": 30}";

        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);

        String nome = pessoa1.nome();
        String cidade = pessoa1.cidade();
        int idade = pessoa1.idade();

        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(idade);

    }
}
