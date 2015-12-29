package com.designpattern.chap7.adapter;

public class Adapter implements Target
{
	Adaptee adaptee;

	public Adapter(Adaptee a)
	{
		adaptee = a;
	}

	@Override
	public void request()
	{
		adaptee.apdaptedRequest();
	}

}
