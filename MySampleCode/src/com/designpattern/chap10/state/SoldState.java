package com.designpattern.chap10.state;

public class SoldState implements State
{

	private GumBallMachine gumballmachine;

	
	public SoldState(GumBallMachine gumballmachine)
	{
		this.gumballmachine = gumballmachine;
	}

	@Override
	public void insertQuater()
	{
		System.out.println("Please wait, we are already giving you the gumball.");
	}

	@Override
	public void ejectQuater()
	{
		System.out.println("Sorry, you already turned the crank.");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Turning crank more the once, dosent give you more gumball.");
	}

	@Override
	public void dispense()
	{
		gumballmachine.releaseBall();
		if(gumballmachine.getCount() > 0)
		{
			gumballmachine.setState(gumballmachine.getNoQuaterState());
		}else
		{
			System.out.println("Oops, Out of GumBall.");
			gumballmachine.setState(gumballmachine.getSoldOutState());
		}
		
	}

}
