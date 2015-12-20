package com.designpattern.chap2.observer;

public interface MyObservable {

	void registerObserver(MyObserver o);
	void removeObserver(MyObserver o);
	int[] getData();
	void notifyObserver();
	
}
