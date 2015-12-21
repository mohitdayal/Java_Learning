package com.designpattern.chap3.decorator;

public abstract class Beverage {

	private String description = "Your coffee: ";
	
	protected float cost;

	public String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
	
	public abstract float cost();
	
	
}
