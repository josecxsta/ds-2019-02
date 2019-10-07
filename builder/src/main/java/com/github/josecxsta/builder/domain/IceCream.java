package com.github.josecxsta.builder.domain;

import java.util.List;


/**
 * Implementação de um sorvete com coberturas,
 * frutas, sabores e a possibilidade de ser vegano ou não. 🍦 🍓
 * @author José da Costa
 * 
 */
public class IceCream {

	private List<String> flavours;
	private List<String> toppings;
	private List<String> fruits;
	private boolean vegan;
	
	/**
	 * TODO não é usual o Builder "fora" da classe. Você deve possuir um bom motivo!
	 * TODO public? Isto não é "quebrar" o que chamamos de information hiding?
	 
	 * Construtor privado para utilização do builder
	 * @param iceCreamBuild {@link IceCreamBuilder}
	 */
	public IceCream(IceCreamBuilder iceCreamBuild) {
		this.flavours = iceCreamBuild.getFlavours();
		this.toppings = iceCreamBuild.getToppings();
		this.fruits = iceCreamBuild.getFruits();
		this.vegan = iceCreamBuild.isVegan();
	}
	
	/**
     * Descreve o sorvete.
     * @return A descrição do sorvete.
     */
    @Override
    public String toString() {
        String parcial = "Sorvete ";
        parcial = parcial.concat(une(flavours));
        parcial = parcial.concat(" " + une(toppings));
        parcial = parcial.concat(" " + une(fruits));
        
        if (this.vegan) {
        	parcial = parcial.concat(" vegano.");
        }
        
        return parcial;
    }
    
    /**
     * Concatena as sequências fornecidas na lista.
     *
     * @param lista A lista de sequências a serem concatenadas.
     *
     * @return A sequência de caracteres formada pela união das sequências
     * contidas na lista separadas por espaço em branco.
     */
    private String une(List<String> lista) {
        return String.join(" ", lista);
    }
	
	// TODO faltam os métodos get....
	
}
