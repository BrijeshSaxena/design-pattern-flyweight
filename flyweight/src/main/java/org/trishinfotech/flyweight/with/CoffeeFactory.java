package org.trishinfotech.flyweight.with;

import java.util.WeakHashMap;

import org.trishinfotech.flyweight.CoffeeFlavour;
import org.trishinfotech.flyweight.CoffeeLatteArt;

public class CoffeeFactory {

	protected static WeakHashMap<CoffeeFlavour, Coffee> coffeeMap = new WeakHashMap<CoffeeFlavour, Coffee>();
	
	public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
		Coffee coffee = coffeeMap.get(flavourName);
		if (coffee == null) {
			coffee = new Coffee(flavourName);
			coffeeMap.put(flavourName, coffee);
		}
		System.out.printf("Making '%s' with Latte Art '%s'.\n", coffee.getFlavourName(),
				coffee.applyLatteArt(latteArt));
		return coffee;
	}

	public static int getNumberOfCoffee() {
		return coffeeMap.size();
	}
	
}
