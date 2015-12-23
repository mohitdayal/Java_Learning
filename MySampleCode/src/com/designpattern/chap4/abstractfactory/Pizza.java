package com.designpattern.chap4.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;

	ArrayList<String> toppings = new ArrayList<String>();

	public abstract void prepare();
	
	
	public Pizza() {
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


	public void setName(String string) {
		name = string;
		
	}
}
