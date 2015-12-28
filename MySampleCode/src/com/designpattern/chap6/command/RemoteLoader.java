package com.designpattern.chap6.command;

public class RemoteLoader
{

	public static void main(String[] args)
	{
		RemoteControl rc = new RemoteControl(2);
		
		rc.setCommands(0, 0, new LightOn(), new LightOff());
		rc.setCommands(1, 1, new LightOn(), new LightOff());
	
		System.out.println(rc);
		
		rc.onButtonPushed(0);
		rc.offButtonPushed(0);
		
		rc.onButtonPushed(1);
		rc.offButtonPushed(1);
		
		
		
	}
	
}
