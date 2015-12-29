package com.designpattern.chap9.iterator;

public class Simulator
{
	public static void main(String[] args)
	{
		MenuItem [] items = new MenuItem[10];
		for (int i = 0; i < items.length; i++)
		{
			items[i] = new MenuItem("Item number - "+i , " Good One ", i%2 == 0, i*Math.random() * 10);
		}
	
		Iterator itr = new MenuItemIterator(items);
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
	}
}
