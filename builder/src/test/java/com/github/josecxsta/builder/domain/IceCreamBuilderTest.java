/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.builder.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class IceCreamBuilderTest {

    @Test
    public void valores() {
    		IceCream ic = new IceCreamBuilder().addFlavour("Morango").build();
			assertEquals(ic.toString(), "Sorvete Morango  ");
		
    }

}


