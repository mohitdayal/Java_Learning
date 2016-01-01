package com.designpattern.chap9.composite;

public abstract class MenuComponent
{
	String getName()
	{
		throw new UnsupportedOperationException();
	}

	void add(MenuComponent c)
	{
		throw new UnsupportedOperationException();
	}

	void remove(MenuComponent c)
	{
		throw new UnsupportedOperationException();
	}

	MenuComponent getChild(int i)
	{
		throw new UnsupportedOperationException();
	}

	String getDescription()
	{
		throw new UnsupportedOperationException();
	}

	double getPrice()
	{
		throw new UnsupportedOperationException();
	}

	boolean isVegetarian()
	{
		throw new UnsupportedOperationException();
	}

	void print()
	{
		throw new UnsupportedOperationException();
	}

}
