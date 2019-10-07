package com.github.josecxsta.di.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Armazena os fornecedores de leite.
 */
public class DiretorioFornecedores {

    /**
     * Lista de nome de fornecedores.
     */
    private List<String> fornecedores;


    /**
     * Instancia a classe e a lista de nome de fornecedores.
     */
    public DiretorioFornecedores() {
        this.fornecedores = new ArrayList<String>();
    }


    /**
     * Acrescenta um fornecedor a lista de fornecedores.
     * @param fornecedor classe do fornecedor.
     */
    public void acrescenta(Supplier<Leite> fornecedor) {
        String nomeFornecedor = fornecedor
            .get().getFornecedor();
        this.fornecedores.add(nomeFornecedor);
    }

    /**
     * Obtém a lista de fornecedores.
     */
    public List<String> fornecedores() {
        return this.fornecedores;
    }

}
