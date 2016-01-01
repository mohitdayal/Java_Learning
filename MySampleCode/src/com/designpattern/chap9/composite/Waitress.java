package com.designpattern.chap9.composite;

public class Waitress
{
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus)
	{
		this.allMenus = allMenus;
	}

	public void print()
	{
		allMenus.print();
	}

}
