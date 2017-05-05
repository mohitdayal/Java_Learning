package com.java.learning;

public class BNode<T> {
	BNode<T> parent;
	BNode<T> right;
	BNode<T> left;
	T data;
	
	public BNode<T> getParent() {
		return parent;
	}
	public void setParent(BNode<T> parent) {
		this.parent = parent;
	}
	public BNode<T> getRight() {
		return right;
	}
	public void setRight(BNode<T> right) {
		this.right = right;
	}
	public BNode<T> getLeft() {
		return left;
	}
	public void setLeft(BNode<T> left) {
		this.left = left;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	

}
