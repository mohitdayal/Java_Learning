package com.designpattern.chap1.strategy;

public class MallardDuck extends Duck {

	@Override
	public String toString() {
		return "Mallard Duck Class";
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println(" I am a Mallard Duck.");
	}

	@Override
	public void performQuack() {
		quackBehaviour.quack();
	}

	@Override
	public void performfly() {
		flyBehaviour.fly();
	}
	@Override
	public void setflyBehaviour(FlyBehaviour fb) {
		flyBehaviour =fb;		
	}

	@Override
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}


}
