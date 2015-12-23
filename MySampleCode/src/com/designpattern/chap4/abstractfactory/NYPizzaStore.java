package com.designpattern.chap4.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza =null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		switch (type) {
		case "cheese":
			
			pizza = new CheesePizza(factory);
			pizza.setName("New York style Cheese Pizza");
			break;
		case "veggie":
			pizza = new VeggiePizza(factory);
			pizza.setName("New York style Veggie Pizza");
		default:
			break;
		}
		
		return pizza;
	}

}
