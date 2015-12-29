package com.designpattern.chap9.iterator;

public class MenuItem
{
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuItem(String n, String d, boolean v, double p)
	{
		name = n;
		description = d;
		vegetarian = v;
		price = p;
	}

	@Override
	public String toString()
	{
		return "Name: " + name + " Desription: " + description + " Vegetarian: " + vegetarian + " Price: " + price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDecription()
	{
		return description;
	}

	public void setDecription(String decription)
	{
		this.description = decription;
	}

	public boolean getVegetarian()
	{
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian)
	{
		this.vegetarian = vegetarian;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}
