package com.designpattern.chap4.factory;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY style Sauce & Cheese Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		toppings.add("Grated Reggiano cheese");
	}
}
