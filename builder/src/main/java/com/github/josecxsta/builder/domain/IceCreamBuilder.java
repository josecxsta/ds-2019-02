package com.github.josecxsta.builder.domain;

import java.util.ArrayList;
import java.util.List;

import com.github.josecxsta.builder.interfaces.Builder;

/**
 * Construtor para a classe IceCream. 🍦 🍓
 * @author José da Costa
 *
 */
public class IceCreamBuilder implements Builder {

	// TODO deveria ser um Enum, por exemplo, Flavour.
	// TODO deveria ser um Set, list permite duplicidade. 
	private List<String> flavours = new ArrayList<>();
	private List<String> toppings = new ArrayList<>();
	private List<String> fruits = new ArrayList<>();
	private boolean vegan = false;
	
	public IceCreamBuilder() {
		
	}
	
	/**
	 * Adiciona um sabor ao sorvete.
	 * @param flavour sabor
	 * @return instância de IceCreamBuilder
	 */
	public IceCreamBuilder addFlavour(String flavour) {
		this.getFlavours().add(flavour);
		return this;
	}
	
	/**
	 * Adiciona uma cobertura ao IceCreamBuilder.
	 * @param topping cobertura
	 * @return instância de IceCreamBuilder
	 */
	public IceCreamBuilder addTopping(String topping) {
		this.getToppings().add(topping);
		return this;
	}
	
	
	/**
	 * Define que o sorvete será vegano.
	 * @return instância de IceCreamBuilder
	 */
	public IceCreamBuilder vegan() {
		this.setVegan();
		return this;
	}
	
	/**
	 * Monta uma instância de IceCream conforme 
	 * os atributos deste builder.
	 * 
	 * @return instância da classe {@link IceCream}
	 */
	public IceCream build() {
		IceCream ic = new IceCream(this);
		return ic;
	}

	public List<String> getFlavours() {
		return flavours;
	}

	public List<String> getToppings() {
		return toppings;
	}
	
	public List<String> getFruits() {
		return fruits;
	}

	public boolean isVegan() {
		return vegan;
	}
	
	public void setVegan() {
		this.vegan = true;
	}

	
}
