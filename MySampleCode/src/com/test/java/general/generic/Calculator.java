package com.test.java.general.generic;

public interface Calculator<T> {

	T add(T t1 , T t2);
	Type<T> sub(Type<T> t1 , Type<T> t2);
	boolean isEqual(Type<T> t1 , Type<T> t2);
}
