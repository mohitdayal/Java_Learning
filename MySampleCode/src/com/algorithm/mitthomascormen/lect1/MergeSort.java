package com.algorithm.mitthomascormen.lect1;

public class MergeSort {

	public void sort(int[] input, int startInd, int endInd) {
		if (endInd - startInd == 0) {
			return;
		}
		int mid = (endInd - startInd) / 2;
		sort(input, startInd, startInd + mid);
		sort(input, startInd + 1 + mid, endInd);
		
		int pos1 = startInd;
		int pos2 = startInd + mid + 1;
		int[] arr = new int[endInd-startInd +1];
		for (int i = 0; i < arr.length; i++) {
			if(pos2 <= endInd && input[pos1] > input[pos2])
			{
				arr[i] = input[pos2];
				pos2++;
			}
			else if(pos2 > endInd || input[pos1] <= input[pos2])
			{
				arr[i] = input[pos1];
				pos1++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			input[startInd+i] = arr[i]; 
		}
		

	}

}
