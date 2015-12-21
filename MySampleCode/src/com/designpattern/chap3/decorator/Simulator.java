package com.designpattern.chap3.decorator;

public class Simulator {

	public static void main(String[] args) {
		Beverage myBev1 = new Espresso();
		
		System.out.println(myBev1.getDescription() + "Cost: " + myBev1.cost());
		
		myBev1 = new Milk(myBev1);
		System.out.println(myBev1.getDescription() + "Cost: " + myBev1.cost());
		
		myBev1 = new Soy(myBev1);
		System.out.println(myBev1.getDescription() + "Cost: " + myBev1.cost());
		
		myBev1 = new Whip(myBev1);
		System.out.println(myBev1.getDescription() + "Cost: " + myBev1.cost());
		
		myBev1 = new Mocha(myBev1);
		System.out.println(myBev1.getDescription() + "Cost: " + myBev1.cost());
		
		Beverage myBev2 = new Decaf();
		
		System.out.println(myBev2.getDescription() + "Cost: " + myBev2.cost());
		
		myBev2 = new Milk(myBev2);
		System.out.println(myBev2.getDescription() + "Cost: " + myBev2.cost());
		
		myBev2 = new Soy(myBev2);
		System.out.println(myBev2.getDescription() + "Cost: " + myBev2.cost());
		
		myBev2 = new Whip(myBev2);
		System.out.println(myBev2.getDescription() + "Cost: " + myBev2.cost());
		
		myBev2 = new Mocha(myBev2);
		System.out.println(myBev2.getDescription() + "Cost: " + myBev2.cost());
		
	}
	
}
