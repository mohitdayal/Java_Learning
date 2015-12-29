package com.designpattern.chap8.template;

public class Coffee extends CaffeineBeverage
{

	@Override
	void brew()
	{
		System.out.println("Dripping Coffee through filter. ");

	}

	@Override
	void addCondiments()
	{
		System.out.println("Adding Milk and Sugar. ");
	}

}
