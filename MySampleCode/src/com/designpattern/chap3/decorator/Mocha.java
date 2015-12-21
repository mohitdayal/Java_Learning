package com.designpattern.chap3.decorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage b) {
		type = b;
	}
	
	@Override
	public float cost() {
		return super.cost() + 2;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Mocha ";
	}
}
