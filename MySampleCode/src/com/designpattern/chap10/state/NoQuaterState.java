package com.designpattern.chap10.state;

public class NoQuaterState implements State
{

	private GumBallMachine gumballmachine;
	
	public NoQuaterState(GumBallMachine gumballmachine)
	{
		this.gumballmachine = gumballmachine;
	}

	@Override
	public void insertQuater()
	{
		System.out.println("You have Inserted a Quater");
		gumballmachine.setState(gumballmachine.getHasQuaterState());
	}

	@Override
	public void ejectQuater()
	{
		System.out.println("You have not Inserted a Quater");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned, but there is no quater.");
	}

	@Override
	public void dispense()
	{
		System.out.println("You need to pay first.");
	}

}
