package com.designpattern.chap2.observer;

import java.util.ArrayList;

public class Subject implements MyObservable {

	ArrayList<MyObserver> observers;

	int[] data;

	public Subject() {
		observers = new ArrayList();
		data = new int[1];
	}

	@Override
	public void registerObserver(MyObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(MyObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void setData(int[] d) {
		boolean valChanged = false;
		for (int i = 0; i < d.length; i++) {
			if (data[i] != d[i]) {
				data[i] = d[i];
				valChanged = true;
			}
		}
		if(valChanged)
		{
			notifyObserver();
		}
	}

	@Override
	public int[] getData() {
		return data;
	}

	@Override
	public void notifyObserver() {
		for (MyObserver observer : observers) {
			observer.update(getData());
		}

	}

}
