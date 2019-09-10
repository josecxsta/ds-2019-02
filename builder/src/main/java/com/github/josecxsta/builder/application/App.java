package com.github.josecxsta.builder.application;

import java.lang.reflect.InvocationTargetException;

import com.github.josecxsta.builder.domain.IceCream;
import com.github.josecxsta.builder.domain.IceCreamBuilder;


/**
 * App
 */
public class App {

    public static void main(String args[]) {
        IceCream sorvete = new IceCreamBuilder()
        		.addFlavour("Banana")
        		.addFlavour("Baunilha")
        		.addFlavour("Chocolate")
        		.addTopping("Castanha")
        		.vegan()
        		.build();
        System.out.println(sorvete.toString());
    }
}