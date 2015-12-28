package com.designpattern.chap6.command;

public class LightOff implements Command
{
	String commandName;

	public LightOff()
	{
		commandName = "LightOff";
	}
	
	@Override
	public void execute()
	{
		System.out.println(" Light was turned OFF ");
	}

	@Override
	public void undo()
	{
		System.out.println("Not defined.");
	}
	
	@Override
	public String toString()
	{
		return commandName + " ";
	}

}
