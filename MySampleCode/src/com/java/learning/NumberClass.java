package com.java.learning;

public class NumberClass {

	public static void main(String[] args) {
		
		typeConversion();
	}

	private static void typeConversion() {
		Float f = new Float(7.04);
		Number n = f;
		f= new Float(3.4);
		Integer i = n.intValue();
		System.out.println(i);
		System.out.println(f);
		System.out.println(Character.forDigit(18, 19));
		System.out.println(Character.isMirrored('{'));
	}
	
}
