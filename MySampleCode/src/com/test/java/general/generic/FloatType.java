package com.test.java.general.generic;

public class FloatType<T> implements Calculator<T> {
	public T t;
	public Integer data;

	

	
	@Override
	public T add(T t1, T t2) {
		return null;
	}

	@Override
	public Type<T> sub(Type<T> t1, Type<T> t2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEqual(Type<T> t1, Type<T> t2) {
		
		return t1.equals(t2);
	}

}
