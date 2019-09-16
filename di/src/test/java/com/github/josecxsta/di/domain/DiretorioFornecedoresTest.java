package com.github.josecxsta.di.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class DiretorioFornecedoresTest {

    @Test
    public void injecao() {

        Supplier<Leite> fornecedor1 = new CaldasNovas();
        Supplier<Leite> fornecedor2 = new Itambe();

        DiretorioFornecedores diretorio = 
            new DiretorioFornecedores();

        diretorio.acrescenta(fornecedor1);
        diretorio.acrescenta(fornecedor2);

        List<String> lista = new ArrayList<String>();
        lista.add("CaldasNovas");
        lista.add("Itambe");

        List<String> fornecedores = diretorio.fornecedores();

        assertEquals(lista, fornecedores);

    }

}

