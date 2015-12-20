package com.designpattern.chap2.observer;

public class Simulator {
	public static void main(String[] args) {

		Subject a= new Subject();
		IamObserving o1 = new IamObserving("Ob1");
		IamObserving o2 = new IamObserving("Ob2");
		a.registerObserver(o1);
		a.registerObserver(o2);
		
		a.setData(new int[]{1});
		a.setData(new int[]{2});
		a.setData(new int[]{3});
	}

}
