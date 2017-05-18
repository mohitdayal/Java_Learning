package com.algorithm.mitthomascormen.lect4;

public class TestAlgos {

	public static void main(String[] args) {
		testQuickSort();
	}
	
	static void testQuickSort()
	{
		int[] inputarr = {6,5,3,1,8,7,2,4};
		QuickSort ms = new QuickSort();
		ms.sort(inputarr,0,inputarr.length-1);
		for (int i : inputarr) {
			System.out.println(i + " ");
		}
	}
}
