package com.designpattern.chap10.state;

public class Simulator
{
	public static void main(String[] args)
	{
		GumBallMachine machine = new GumBallMachine(5);

		System.out.println(machine);

		machine.insertQuater();
		machine.trunCrank();

		System.out.println(machine);

		machine.insertQuater();
		machine.ejectQuater();
		machine.trunCrank();

		System.out.println(machine);

		machine.insertQuater();
		machine.trunCrank();
		machine.insertQuater();
		machine.trunCrank();
		machine.ejectQuater();

		System.out.println(machine);

		machine.insertQuater();
		machine.insertQuater();
		machine.trunCrank();
		machine.insertQuater();
		machine.trunCrank();
		machine.insertQuater();
		machine.trunCrank();

		System.out.println(machine);

	}

}
