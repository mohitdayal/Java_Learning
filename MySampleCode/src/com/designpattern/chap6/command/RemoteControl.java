package com.designpattern.chap6.command;

public class RemoteControl
{

	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl(int commands)
	{
		onCommands = new Command[commands];
		offCommands = new Command[commands];
	}

	public void setCommands(int onslot, int offslot, Command oncmd, Command offcmd)
	{
		onCommands[onslot] = oncmd;
		offCommands[offslot] = offcmd;
	}
	
	public void onButtonPushed(int slot)
	{
		onCommands[slot].execute();
	}
	
	public void offButtonPushed(int slot)
	{
		offCommands[slot].execute();
	}
	
	@Override
	public String toString()
	{
		String s = null;
		s= "On Commands are: ";
		for (Command command : onCommands)
		{
			s+=command.toString();
		}
		
		s+="\n OffCommands are: ";
		
		for (Command command : offCommands)
		{
			s+=command.toString();
		}
		return s;
	}
}
