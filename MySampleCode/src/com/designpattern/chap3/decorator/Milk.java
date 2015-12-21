package com.designpattern.chap3.decorator;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage b) {
		type = b;
	}
	
	@Override
	public float cost() {
		return super.cost() + 2;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Milk ";
	}
}
