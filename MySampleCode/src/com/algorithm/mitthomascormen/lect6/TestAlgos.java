package com.algorithm.mitthomascormen.lect6;

public class TestAlgos {

	public static void main(String[] args) {
		testQuickSort();
	}
	
	static void testQuickSort()
	{
		int[] inputarr = { 10,11,12,13,14,15,16,9, 8, 6, 7, 5, 4, 3, 2};
		OrderStatistic os = new OrderStatistic();
		int val = os.getNthOrder(inputarr,0,inputarr.length-1 , 5);
		System.out.println(val);
	}
}
