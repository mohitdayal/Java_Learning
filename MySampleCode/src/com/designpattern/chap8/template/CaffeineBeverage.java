package com.designpattern.chap8.template;

public abstract class CaffeineBeverage
{
	final public void prepareDrink()
	{
		boilWater();
		brew();
		addCondiments();
		pourInCup();
		hook();
	}
	
	abstract void brew();
	abstract void addCondiments();
	void hook()
	{
		
	}
	
	public void boilWater()
	{
		System.out.println("Boiling Walter. ");
	}

	public void pourInCup()
	{
		System.out.println("Pouring In a Cup. ");
	}
	
}
