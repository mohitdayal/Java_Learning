package com.algorithm.mitthomascormen.lect1;

public class TestAlgos {

	public static void main(String[] args) {
		testInsertionSort();
	}
	
	static void testInsertionSort()
	{
		int[] inputarr = { 9, 8, 6, 7, 5, 4, 3, 2, 1 };
		InsertionSort is = new InsertionSort();
		is.sort(inputarr);
		for (int i : inputarr) {
			System.out.println(i + " ");
		}
	}
}
