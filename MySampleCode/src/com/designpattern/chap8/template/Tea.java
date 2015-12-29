package com.designpattern.chap8.template;

public class Tea extends CaffeineBeverage
{

	@Override
	void brew()
	{
		steepTeaBag();
	}

	@Override
	void addCondiments()
	{
		System.out.println("Adding Lemon and Sugar. ");

	}

	private void steepTeaBag()
	{
		System.out.println("Steeping Tea Bag. ");
	}
	
	@Override
	void hook()
	{
		System.out.println("Refregerate it and make an Ice Tea. ");
	}

}
