package com.test.java.general.generic;

public class MainClass {
	public static void main(String[] args) {
		FloatType<Float> floatType = new FloatType<Float>();
		Type<Float> f = new Type<Float>();
		System.out.println(floatType.isEqual(f, f));

		
	}
}
