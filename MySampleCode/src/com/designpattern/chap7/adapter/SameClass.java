package com.designpattern.chap7.adapter;

public class SameClass implements Target
{

	@Override
	public void request()
	{
		System.out.println("Same type Class.");
	}

}
