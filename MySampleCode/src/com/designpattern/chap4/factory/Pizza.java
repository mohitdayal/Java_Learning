package com.designpattern.chap4.factory;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;

	ArrayList<String> toppings = new ArrayList<String>();

	public Pizza() {
	}

	public void prepare() {
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding Sauce... ");
		System.out.println("Adding Toppings: ");
		for (String string : toppings) {
			System.out.print("  " + string);
		}
		System.out.println();
	}

	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350.");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	
	public void box()
	{
		System.out.println("Place pizza into official PizzaStore Box.");
	}
	
	public String getName()
	{
		return name;
	}
}
