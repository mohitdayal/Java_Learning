package com.designpattern.chap4.abstractfactory;

public class Simulator {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("cheese");

		System.out.println("\n------\n");
		
		nyStore.orderPizza("veggie");
		
		System.out.println("\n------\n");
		
	}
	
}
