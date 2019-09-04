package com.github.josecxsta.exemplo.domain;

import java.lang.reflect.InvocationTargetException;

/**
 * TrabalhadorFactory
 */
public class TrabalhadorFactory {

    private TrabalhadorFactory () {
    }

    public static Trabalhador newInstance(String name) 
    		throws InstantiationException, IllegalAccessException, 
    		IllegalArgumentException, InvocationTargetException, 
    		NoSuchMethodException, SecurityException, ClassNotFoundException {
    	
    	Class<?> classe = Class.forName(name);
    	return (Trabalhador) classe.getDeclaredConstructor().newInstance();
    }

}
