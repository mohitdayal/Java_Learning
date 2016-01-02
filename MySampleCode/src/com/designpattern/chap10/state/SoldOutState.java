package com.designpattern.chap10.state;

public class SoldOutState implements State
{

	private GumBallMachine gumballmachine;
	int quatercount = 0;

	public SoldOutState(GumBallMachine gumballmachine)
	{
		this.gumballmachine = gumballmachine;
	}

	@Override
	public void insertQuater()
	{
		System.out.println("No Gumballs in the machine, all soldout.");
		quatercount++;
	}

	@Override
	public void ejectQuater()
	{
		if (quatercount == 0)
		{
			System.out.println("You can't eject quater, you haven't inserted one.");
		} else
		{
			System.out.println(" Please take your quater back.");
		}
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned the crank, but there is no gumballs in the machine.");
	}

	@Override
	public void dispense()
	{
		System.out.println("No Gumball dispensed.");
	}

}
