package com.designpattern.chap6.command;

public class LightOn implements Command
{
	String commandName;
	
	public LightOn()
	{
		commandName = "LightOn";
	}
	
	@Override
	public void execute()
	{
		System.out.println(" Light was turned ON;");
		
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
