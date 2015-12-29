package com.algorithm.mitthomascormen.lect5;

public class CountingSort
{
	public void sort(int[] input, int radix)
	{
		int[] radixArray = new int[radix];
		int[] outArray = new int[input.length];
		for (int i = 0; i < input.length; i++)
		{
			radixArray[input[i]]++;
		}
		for (int i = 1; i < radixArray.length; i++)
		{
			radixArray[i] = radixArray[i] + radixArray[i - 1];
		}
		for (int i = input.length - 1; i >= 0; i--)
		{
			outArray[radixArray[input[i]] -1 ] = input[i];
			radixArray[input[i]]--;
		}

		System.arraycopy(outArray, 0, input, 0, input.length);
	}
}
