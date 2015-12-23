package com.designpattern.chap4.abstractfactory;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type);
	
	public void orderPizza(String type){
		
		Pizza  myPizza = createPizza(type);
		myPizza.prepare();
		myPizza.bake();
		myPizza.cut();
		myPizza.box();
		
	}

}
