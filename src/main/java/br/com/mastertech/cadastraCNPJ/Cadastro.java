package br.com.mastertech.cadastraCNPJ;

public class Cadastro {
    private String nome;
    private String cnpj;
    private Double capital_social;

    public Cadastro(String nome, String cnpj, Double capital_social) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.capital_social = capital_social;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(Double capital_social) {
        this.capital_social = capital_social;
    }
}
