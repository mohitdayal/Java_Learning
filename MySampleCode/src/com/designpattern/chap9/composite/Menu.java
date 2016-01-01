package com.designpattern.chap9.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent
{
	ArrayList<MenuComponent> menuComponent = new ArrayList<MenuComponent>();

	String name;

	String description;

	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	@Override
	void add(MenuComponent c)
	{
		menuComponent.add(c);
	}

	@Override
	void remove(MenuComponent c)
	{
		menuComponent.remove(c);
	}

	@Override
	MenuComponent getChild(int i)
	{
		return menuComponent.get(i);
	}

	@Override
	void print()
	{
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("------------------------");

		Iterator<MenuComponent> itr = menuComponent.iterator();

		while (itr.hasNext())
		{
			MenuComponent mc = itr.next();
			mc.print();
		}
	}
}
