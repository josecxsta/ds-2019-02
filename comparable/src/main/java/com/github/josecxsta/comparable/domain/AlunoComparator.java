package com.github.josecxsta.comparable.domain;

import java.util.Comparator;

public class AlunoComparator implements Comparator<Aluno> {

    public int compare(Aluno a, Aluno b)
    {
        return a.getNome().length() - b.getNome().length();
    }

}
