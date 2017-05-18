package com.algorithm.mitthomascormen.lect4;

public class QuickSort {

	public void sort(int[] input, int p, int q) {

		if (p >= q) {
			return;
		}
		int part = partition(input, p, q);
		sort(input, p, part-1);
		sort(input, part + 1, q);

	}

	private int partition(int[] input, int p, int q) {

		int pivot = input[p];
		int i = p;
		for (int j = p + 1; j <= q; j++) {
			if (input[j] < pivot) {
				int temp = input[i + 1];
				input[i + 1] = input[j];
				input[j] = temp;
				i++;
			}
		}
		input[p] = input[i];
		input[i] = pivot;
		return i;
	}

}
