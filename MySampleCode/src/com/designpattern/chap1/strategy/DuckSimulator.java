package com.designpattern.chap1.strategy;

public class DuckSimulator {

	public static void main(String[] args) {
		
		Duck mallarduck = new MallardDuck();
		
		Duck decoyduck = new DecoyDuck();
		
		Duck redheadDuck = new RedHeadDuck();
		
		Duck rubberduck = new RubberDuck();
		
		mallarduck.setflyBehaviour(new FlyWithWings());
		mallarduck.setQuackBehaviour(new Quack());
		
		decoyduck.setflyBehaviour(new FlyNoWay());
		decoyduck.setQuackBehaviour(new MuteQuack());
		
		redheadDuck.setflyBehaviour(new FlyWithWings());
		redheadDuck.setQuackBehaviour(new Quack());
		
		rubberduck.setflyBehaviour(new FlyNoWay());
		rubberduck.setQuackBehaviour(new Squeak());
		
		mallarduck.display();
		mallarduck.performfly();
		mallarduck.performQuack();
		System.out.println("---- ");
		
		decoyduck.display();
		decoyduck.performfly();
		decoyduck.performQuack();
		System.out.println("---- ");
		
		redheadDuck.display();
		redheadDuck.performfly();
		redheadDuck.performQuack();
		System.out.println("---- ");
		
		rubberduck.display();
		rubberduck.performfly();
		rubberduck.performQuack();
		
		
	}
	
}
