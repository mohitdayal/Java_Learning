package com.designpattern.chap4.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza p = null;
		switch (type) {
		case "cheese":
			p = new NYStyleCheesePizza();
			break;

		default:
			break;
		}

		return p;
	}

}
