package com.github.josecxsta.exemplo.infrastructure;

import com.github.josecxsta.exemplo.domain.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactoryTest {

    public static final String CLZ =
            "com.github.josecxsta.exemplo.domain.Aluno";

    @Test
    void classeNaoFornecida() {
        Throwable excecao = assertThrows(NullPointerException.class, () ->
                Factory.newInstance(null));

        assertEquals("classe", excecao.getMessage());
    }

    @Test
    void instanciaParaClasseDeTeste() {
        Aluno aluno = (Aluno) Factory.newInstance(CLZ);
        assertEquals("estudar", aluno.atividade());
    }
}
