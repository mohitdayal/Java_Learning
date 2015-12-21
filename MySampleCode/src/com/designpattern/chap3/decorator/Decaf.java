package com.designpattern.chap3.decorator;

public class Decaf extends Beverage {

	@Override
	public float cost() {
		return cost + 4;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + "Decaf ";
	}

}
