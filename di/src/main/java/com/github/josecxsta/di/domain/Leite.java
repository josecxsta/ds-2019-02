package com.github.josecxsta.di.domain;

public class Leite {

    private String fornecedor;

    public Leite(String nomeFornecedor) {
        this.setFornecedor(nomeFornecedor);
    }

    public String getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(String nome) {
        this.fornecedor = nome;
    }

}
