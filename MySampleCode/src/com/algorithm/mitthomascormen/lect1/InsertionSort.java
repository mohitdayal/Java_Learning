package com.algorithm.mitthomascormen.lect1;

public class InsertionSort {

	public void sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int j = i - 1;
			int key = input[i];
			while (j >=0) {
				if (input[j] > key) {
					input[j + 1] = input[j];
					input[j] = key;
				}
				else
				{
				    break;
				}
				j--;
			}
		}
	}
}
