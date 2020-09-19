package org.trishinfotech.flyweight.without;

import java.util.ArrayList;
import java.util.List;

import org.trishinfotech.flyweight.CoffeeFlavour;
import org.trishinfotech.flyweight.CoffeeLatteArt;

public class CoffeeFactory {

	protected static List<Coffee> coffeeList = new ArrayList<Coffee>();

	public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
		Coffee coffee = new Coffee(flavourName, latteArt);
		System.out.printf("Making '%s' with Latte Art '%s'.\n", coffee.getFlavourName(), coffee.getLatteArt());
		coffeeList.add(coffee);
		return coffee;
	}

	public static int getNumberOfCoffee() {
		return coffeeList.size();
	}
}
