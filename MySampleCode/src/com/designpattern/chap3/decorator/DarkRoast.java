package com.designpattern.chap3.decorator;

public class DarkRoast extends Beverage {

	@Override
	public float cost() {
		return cost + 6;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "DarkRoast ";
	}
}
