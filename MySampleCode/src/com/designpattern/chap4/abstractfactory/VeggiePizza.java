package com.designpattern.chap4.abstractfactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory factory;

	public VeggiePizza(PizzaIngredientFactory f) {
		factory = f;
	}

	@Override
	public void prepare() {

		System.out.println("Preparing: "+ name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		veggies = factory.createVeggies();
	}

}
