package com.github.josecxsta.exemplo.application.api;

import java.lang.reflect.InvocationTargetException;

import com.github.josecxsta.exemplo.domain.Trabalhador;
import com.github.josecxsta.exemplo.domain.Aluno;
import com.github.josecxsta.exemplo.domain.Professor;
import com.github.josecxsta.exemplo.domain.TrabalhadorFactory;

/**
 * App
 */
public class App {

    public static void main(String args[]) 
    		throws InstantiationException, IllegalAccessException, 
    		IllegalArgumentException, InvocationTargetException, 
    		NoSuchMethodException, SecurityException, ClassNotFoundException {
        Trabalhador t1 = TrabalhadorFactory.newInstance("Professor");
        System.out.println(t1.atividade());
    }
}