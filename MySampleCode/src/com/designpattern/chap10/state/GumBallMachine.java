package com.designpattern.chap10.state;

public class GumBallMachine
{
	private State currentState;

	private State hasQuaterState;

	private State noQuaterState;

	private State soldState;

	private State soldOutState;
	
	private State winnerState;

	int gumballCount = 0;

	@Override
	public String toString()
	{
		String s   = "Welcome to : Gumball Machine Inc.";
		s+= "\n Java Gumball Machine."
				+ "\n Inventory: " + gumballCount
				+ " \n Machine is wating for Quater...";
		
		return s;
	}
	
	public GumBallMachine(int gumballCount)
	{
		this.hasQuaterState = new HasQuaterState(this);
		this.noQuaterState = new NoQuaterState(this);
		this.soldState = new SoldState(this);
		this.soldOutState = new SoldOutState(this);
		this.winnerState = new WinnerState(this);
		
		this.gumballCount = gumballCount;
		this.currentState = soldOutState;

		if (gumballCount > 0)
		{
			this.currentState = noQuaterState;
		}

	}

	void setState(State s)
	{
		currentState = s;
	}

	public State getHasQuaterState()
	{
		return hasQuaterState;
	}

	public State getNoQuaterState()
	{
		return noQuaterState;
	}

	public State getSoldState()
	{
		return soldState;
	}

	public int getCount()
	{
		return gumballCount;
	}

	public State getSoldOutState()
	{
		return soldOutState;
	}

	public void releaseBall()
	{
		System.out.println("GumBall is comes rolling out....");
		if (gumballCount != 0)
		{
			gumballCount--;
		}

	}

	public void insertQuater()
	{
		currentState.insertQuater();
	}

	public void ejectQuater()
	{
		currentState.ejectQuater();
	}

	public void trunCrank()
	{
		currentState.turnCrank();
		currentState.dispense();
	}

	public State getWinnerState()
	{
		return winnerState;
	}
}
