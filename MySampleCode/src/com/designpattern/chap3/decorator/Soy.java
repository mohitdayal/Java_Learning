package com.designpattern.chap3.decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage b) {
		type = b;
	}
	@Override
	public float cost() {
		return super.cost() + 2;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Soy ";
	}
	
}
