package com.designpattern.chap7.adapter;

public class Simulator
{

	public static void main(String[] args)
	{
		Target sameType = new SameClass();
		Target someType = new Adapter(new SomeClass());
		
		sameType.request();
		someType.request();
		
		
	}
}
