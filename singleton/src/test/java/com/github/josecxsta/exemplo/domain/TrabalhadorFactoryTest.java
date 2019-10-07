/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.exemplo.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class TrabalhadorFactoryTest {

    @Test
    public void aluno() 
    		throws InstantiationException, IllegalAccessException, 
    		IllegalArgumentException, InvocationTargetException, 
    		NoSuchMethodException, SecurityException, ClassNotFoundException {
       
			assertEquals(TrabalhadorFactory
					.newInstance("com.github.josecxsta.exemplo.domain.Aluno").atividade(), "estudar");
			assertEquals(TrabalhadorFactory
					.newInstance("com.github.josecxsta.exemplo.domain.Professor").atividade(), "educar");
		
    }

}


