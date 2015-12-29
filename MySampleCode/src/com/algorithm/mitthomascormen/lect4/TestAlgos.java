package com.algorithm.mitthomascormen.lect4;

public class TestAlgos {

	public static void main(String[] args) {
		testQuickSort();
	}
	
	static void testQuickSort()
	{
		int[] inputarr = { 10,11,12,13,14,15,16,9, 8, 6, 7, 5, 4, 3, 2, 1 };
		QuickSort ms = new QuickSort();
		ms.sort(inputarr,0,inputarr.length-1);
		for (int i : inputarr) {
			System.out.println(i + " ");
		}
	}
}
