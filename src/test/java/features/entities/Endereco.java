package features.entities;

public class Endereco {

    private static String lougradouro, bairro, localidade, cep;

    public Endereco(String lougradouro, String bairro, String localidade, String cep) {
        this.lougradouro = lougradouro;
        this.localidade = localidade;
        this.bairro = bairro;
        this.cep = cep;
    }

    public static String getLougradouro() {
        return lougradouro;
    }

    public static String getBairro() {
        return bairro;
    }

    public static String getLocalidade() {
        return localidade;
    }

    public static String getCep() {
        return cep;
    }

    public void imprimir(){
        System.out.printf(
            "Seu endereco e:\nLougradouro - %s\nBairro - %s\nLocalidade - %s\nCEP - %s\n\n\n",
            this.lougradouro, this.bairro, this.localidade, this.cep
        );
    }
}
