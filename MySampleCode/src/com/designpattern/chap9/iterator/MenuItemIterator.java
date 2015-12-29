package com.designpattern.chap9.iterator;

public class MenuItemIterator implements Iterator
{
	private MenuItem[] items;
	private int position;

	public MenuItemIterator(MenuItem[] items)
	{
		this.items = items;
	}

	@Override
	public boolean hasNext()
	{
		if (items != null && items.length > position)
		{
			return true;
		}
		return false;
	}

	@Override
	public Object next()
	{
		if (items.length > position)
		{
			position++;
			return items[position - 1];
		}
		return null;
	}

}
