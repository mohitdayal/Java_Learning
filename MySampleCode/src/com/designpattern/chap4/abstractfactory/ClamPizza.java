package com.designpattern.chap4.abstractfactory;

public class ClamPizza extends Pizza{
	PizzaIngredientFactory factory;
	
	public ClamPizza(PizzaIngredientFactory f ) {
		factory =f;
	}

	@Override
	public void prepare() {
		System.out.println("Perparing: "+ name);
		dough = factory.createDough();
		clams = factory.createClams();
		cheese = factory.createCheese();
		sauce = factory.createSauce();
	}
	
	
	
}
