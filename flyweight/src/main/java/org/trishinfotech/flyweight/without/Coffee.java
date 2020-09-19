package org.trishinfotech.flyweight.without;

import org.trishinfotech.flyweight.CoffeeFlavour;
import org.trishinfotech.flyweight.CoffeeLatteArt;

public class Coffee {

	protected final CoffeeFlavour flavourName;
	protected final CoffeeLatteArt latteArt;

	protected Coffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
		super();
		this.flavourName = flavourName;
		this.latteArt = latteArt;
	}

	public CoffeeFlavour getFlavourName() {
		return flavourName;
	}

	public CoffeeLatteArt getLatteArt() {
		return latteArt;
	}

}