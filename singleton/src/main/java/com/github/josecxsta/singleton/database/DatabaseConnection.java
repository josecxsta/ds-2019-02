package com.github.josecxsta.singleton.database;

import java.util.List;

/**
 * Classe responsável pela conexão com o SGBD.
 */
public class DatabaseConnection {

    /**
     * Instância de DatabaseConnection.
     */
    private static DatabaseConnection CONNECTION = null;

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
        if (CONNECTION == null) {
            // TODO vamos tentar pela primeira vez ou
            // TODO vamos tentar novamente, afinal, como desistir desta conexão?
            CONNECTION = newInstance();
        }

        return CONNECTION;
    }

    /**
     * Instancia DatabaseConnection por uma única vez.
     */
    private static DatabaseConnection newInstance() {
        try {
            return new DatabaseConnection();
        } catch (Throwable x) {
            // FIXME substituir throwable por exceção específica
            // FIXME fazer registro em log
            //  Muitas situações excepcionais podem ocorrer
            return null;
        }
    }
}
