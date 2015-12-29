package com.algorithm.mitthomascormen.lect5;

/**
 * @author mohitdayal
 * 
 *         Algorithm implemented is with base 10, and expects input also to be
 *         in base 10.
 *
 */
public class RadixSort
{
	public void sort(int[] input, int itrSize)
	{
		for (int i = 0; i < itrSize; i++)
		{
			countingsort(input, i);
		}
	}

	private void countingsort(int[] input, int position)
	{
		int[] radixArray = new int[10];
		int[] outArray = new int[input.length];
		for (int i = 0; i < input.length; i++)
		{
			int num = (int) (input[i] / Math.pow(10, position) % 10);

			radixArray[num]++;
		}
		for (int i = 1; i < radixArray.length; i++)
		{
			radixArray[i] = radixArray[i] + radixArray[i - 1];
		}
		for (int i = input.length - 1; i >= 0; i--)
		{
			int num = (int) (input[i] / Math.pow(10, position) % 10);
			outArray[radixArray[num] - 1] = input[i];
			radixArray[num]--;
		}

		System.arraycopy(outArray, 0, input, 0, input.length);
	}

}
