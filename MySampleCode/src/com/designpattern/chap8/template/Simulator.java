package com.designpattern.chap8.template;

public class Simulator
{
	public static void main(String[] args)
	{
		CaffeineBeverage coffee = new Coffee();
		CaffeineBeverage tea = new Tea();
		
		coffee.prepareDrink();
		System.out.println();
		tea.prepareDrink();
	}
}
