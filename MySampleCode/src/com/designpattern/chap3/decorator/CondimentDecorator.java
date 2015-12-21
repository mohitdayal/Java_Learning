package com.designpattern.chap3.decorator;

public class CondimentDecorator extends Beverage {

	protected Beverage type;
	
	@Override
	public float cost() {
		return type.cost();
	}

	@Override
	public String getDescription() {
		return type.getDescription() +"with extra ";
	}
}
