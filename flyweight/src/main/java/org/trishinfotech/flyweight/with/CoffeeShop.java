package org.trishinfotech.flyweight.with;

import java.util.ArrayList;

import org.trishinfotech.flyweight.CoffeeFlavour;
import org.trishinfotech.flyweight.CoffeeLatteArt;

public class CoffeeShop {
	
	private static final ArrayList<Order> orders = new ArrayList<>();

	public void takeOrder(CoffeeFlavour flavourName, CoffeeLatteArt latteArt, int tableNumber) {
		orders.add(Order.of(flavourName, latteArt, tableNumber));
	}

	public static int getNumberOfOrders() {
		return orders.size();
	}

}