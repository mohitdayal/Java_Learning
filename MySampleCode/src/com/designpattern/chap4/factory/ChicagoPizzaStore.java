package com.designpattern.chap4.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza p = null;
		switch (type) {
		case "cheese":
			p = new ChicagoStyleCheesePizza();
			break;

		default:
			break;
		}

		return p;
	}

}
