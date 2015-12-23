package com.designpattern.chap4.factory;

public class Simulator {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("cheese");

		System.out.println("\n------\n");
		
		PizzaStore chiStore = new ChicagoPizzaStore();
		chiStore.orderPizza("cheese");
	}
	
}
