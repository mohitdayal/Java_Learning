package com.designpattern.chap3.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage b) {
		type = b;
	}

	@Override
	public float cost() {
		return super.cost() + 2;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "Whip ";
	}
}
