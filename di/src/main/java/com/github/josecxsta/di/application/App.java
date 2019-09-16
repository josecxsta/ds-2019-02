package com.github.josecxsta.di.application;

import com.github.josecxsta.di.database.DatabaseConnection;


/**
* Classe principal que contém o método main().
*/
public class App {

	/**
	 * Método main() da aplicação.
	 */
	public static void main(String args[]) {
		DatabaseConnection banco = DatabaseConnection.getInstance();
	}

}
