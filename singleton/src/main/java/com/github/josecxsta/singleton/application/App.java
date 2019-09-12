package com.github.josecxsta.singleton.application;

import com.github.josecxsta.singleton.database.DatabaseConnection;


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
