package com.designpattern.chap9.composite;

public class MenuItem extends MenuComponent
{
	String name;
	
	String description;
	
	double price;
	
	boolean isVegetarian;
	
	public MenuItem(String name, String description, double price, boolean isVegetarian)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public double getPrice()
	{
		return price;
	}

	public boolean isVegetarian()
	{
		return isVegetarian;
	}
	
	@Override
	void print()
	{
		System.out.print(" "+ getName());
		
		if(isVegetarian()) System.out.println("(v)");
		
		System.out.println(", "+ getPrice());
		System.out.println("  --   " +getDescription());
	}
	
	
}
