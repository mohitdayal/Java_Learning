package com.designpattern.chap2.observer;

public class IamObserving implements MyObserver {
	String name;
	public IamObserving(String s) {
		name = s;
	}
	@Override
	public void update(int[] data) {
		System.out.println(name+": Value Updated: "+ data[0]);
	}
	
}
