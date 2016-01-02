package com.designpattern.chap10.state;

import java.util.Random;

public class HasQuaterState implements State
{
	Random winner = new Random(System.currentTimeMillis());
	private GumBallMachine gumballmachine;

	public HasQuaterState(GumBallMachine gumballmachine)
	{
		this.gumballmachine = gumballmachine;
	}

	@Override
	public void insertQuater()
	{
		System.out.println("Machine already had a quater and prcocessing.");
	}

	@Override
	public void ejectQuater()
	{
		System.out.println(" Giving your quater back.");
		gumballmachine.setState(gumballmachine.getNoQuaterState());
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned the crank.");
		int win = winner.nextInt(10);
		if (win == 0 && gumballmachine.getCount() > 1)
		{
			gumballmachine.setState(gumballmachine.getWinnerState());
		} else
		{
			gumballmachine.setState(gumballmachine.getSoldState());
		}
	}

	@Override
	public void dispense()
	{
		System.out.println("No Gumball dispensed.");
	}

}
