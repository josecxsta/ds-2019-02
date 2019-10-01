package com.github.josecxsta.comparable.domain;

import java.util.Comparator;

// FIXME O nome pode ser melhor, pois representa uma operação relevante para o domínio (um bom nome aqui é questão de design). 
// Ter uma classe especificamente para dizer quem vem antes de quem, para um dado cenário, é design. 
public class AlunoComparator implements Comparator<Aluno> {

    public int compare(Aluno a, Aluno b)
    {
        return a.getNome().length() - b.getNome().length();
    }

}
