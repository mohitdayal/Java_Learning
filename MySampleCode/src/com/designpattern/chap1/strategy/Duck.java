package com.designpattern.chap1.strategy;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	
	protected QuackBehaviour quackBehaviour;
	
	public abstract void swim();
	
	public abstract void display();
	
	public abstract void performQuack();
	
	public abstract void performfly();
	
	public abstract void setflyBehaviour(FlyBehaviour fb);
	
	public abstract void setQuackBehaviour(QuackBehaviour qb);
	
}
