package com.algorithm.mitthomascormen.lect5;

public class TestAlgos {

	public static void main(String[] args) {
		testRadixSort();
	}
	static void testCountingSort()
	{
		int[] inputarr = { 12,13,14,5,6,1,9, 8, 6, 7, 5, 4, 3, 2, 1 };
		CountingSort ms = new CountingSort();
		ms.sort(inputarr,15);
		for (int i : inputarr) {
			System.out.print(i + " ");
		}
	}
	
	static void testRadixSort()
	{
		int[] inputarr = { 112,123,314,555,666,341,9, 8, 6, 7, 5, 4, 3, 2, 1 };
		RadixSort ms = new RadixSort();
		ms.sort(inputarr,3);
		for (int i : inputarr) {
			System.out.print(i + " ");
		}
	}
}
