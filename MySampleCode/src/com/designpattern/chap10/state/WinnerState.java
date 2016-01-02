package com.designpattern.chap10.state;import com.sun.org.apache.xpath.internal.functions.FunctionMultiArgs;

public class WinnerState implements State
{
	private GumBallMachine gumballmachine;
	
	public WinnerState(GumBallMachine gumballmachine)
	{
		this.gumballmachine = gumballmachine;
	}
	
	@Override
	public void insertQuater()
	{
		System.out.println("We are already in the process of giving you a gumball.");

	}

	@Override
	public void ejectQuater()
	{
		System.out.println("Cannot eject your quater now you already turned the crank.");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Turning crank more than once, dosen't give you extra gummball.");
	}

	@Override
	public void dispense()
	{
		System.out.println("You are Winner. you will get 2 gumball.");
		gumballmachine.releaseBall();
		if(gumballmachine.getCount() == 0)
		{
			gumballmachine.setState(gumballmachine.getSoldOutState());
		}
		else
		{
			gumballmachine.releaseBall();
			if(gumballmachine.getCount() > 0)
			{
				gumballmachine.setState(gumballmachine.getNoQuaterState());
			}
			else
			{
				System.out.println("Oops, Out off gumballs.");
				gumballmachine.setState(gumballmachine.getSoldOutState());
			}
		}
		
	}

}
