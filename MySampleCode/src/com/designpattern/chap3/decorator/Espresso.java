package com.designpattern.chap3.decorator;

public class Espresso extends Beverage {

	@Override
	public float cost() {
		return cost + 5;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Expresso ";
	}

}
