/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.di.database;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    @Test
    public void instance() {
        DatabaseConnection b1 = DatabaseConnection.getInstance();
        DatabaseConnection b2 = DatabaseConnection.getInstance();
        assertEquals(b1, b2);
    }

}

