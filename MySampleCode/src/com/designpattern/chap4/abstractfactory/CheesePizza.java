package com.designpattern.chap4.abstractfactory;

public class CheesePizza extends Pizza{

	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory f) {
		factory = f;
	}
	@Override
	public void prepare() {
		
		System.out.println("Preparing: "+ name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		
		
		
	}

}
