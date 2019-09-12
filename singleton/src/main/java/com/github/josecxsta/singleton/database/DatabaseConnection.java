package com.github.josecxsta.singleton.database;

import java.util.List;

/**
 * Classe responsável pela conexão com o SGBD.
 */
public class DatabaseConnection {

    /**
     * Instância de DatabaseConnection.
     */
    private static final DatabaseConnection CONNECTION = newInstance();


    /**
     * Construtor privado para evitar mais instanciações.
     */
    private DatabaseConnection() {
        System.out.println("Instância única de DatabaseConnection.");
    }

    /**
     * Obtém a instância única de DatabaseConnection.
     */
    public static DatabaseConnection getInstance() {
        return CONNECTION;
    }

    /**
     * Instancia DatabaseConnection por uma única vez.
     */
    private static DatabaseConnection newInstance() {
        return new DatabaseConnection();
    }

}
