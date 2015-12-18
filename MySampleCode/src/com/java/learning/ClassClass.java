package com.java.learning;

import java.lang.reflect.Method;

public class ClassClass {
	int i = 100;
	public int getI(String s) {
		System.out.println(s);
		return i;
	}
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.java.learning.ClassClass");
			Object o = c.newInstance();
			Method m = c.getMethod("getI",String.class);
			System.out.println(m.invoke(o, "Hello !!!Mohit Dayal"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
}
