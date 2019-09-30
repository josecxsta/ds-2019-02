package com.github.josecxsta.comparable.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class AlunoOrdenacaoTest {

    @Test
    public void ordenados() {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Pedro"));
        alunos.add(new Aluno("Amarildo"));
        assertEquals("Pedro", alunos.get(0).getNome());
        assertEquals("Amarildo", alunos.get(1).getNome());

        Collections.sort(alunos);
        assertEquals("Amarildo", alunos.get(0).getNome());
        assertEquals("Pedro", alunos.get(1).getNome());
    }

    @Test
    public void ordenacaoPeloTamanhoDoNome() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Aparecida"));
        alunos.add(new Aluno("Carla"));
        alunos.add(new Aluno("Xuxa"));

        Collections.sort(alunos, new AlunoComparator());
        assertEquals("Xuxa", alunos.get(0).toString());
        assertEquals("Carla", alunos.get(1).toString());
        assertEquals("Aparecida", alunos.get(2).toString());
    }
}
