package com.algorithm.mitthomascormen.lect6;

public class OrderStatistic
{
	public int getNthOrder(int[] input, int p, int q, int nth)
	{
		int position = randomizedPartition(input, p, q);
		int val = 0;
		if (nth == position)
		{
			val = input[nth];
		} else if (position < nth)
		{
			val = getNthOrder(input, position + 1, q, nth);
		} else
		{
			val = getNthOrder(input, p, position - 1, nth);
		}

		return val;
	}

	private int randomizedPartition(int[] input, int p, int q)
	{
		int rdmNum = p + (int) (Math.random() * (q - p));
		int pivot = input[rdmNum];
		input[rdmNum] = input[p];
		input[p] = pivot;
		int i = p;
		for (int j = p + 1; j <= q; j++)
		{
			if (input[j] <= pivot)
			{
				int temp = input[i + 1];
				input[i + 1] = input[j];
				input[j] = temp;
				i++;
			}
		}
		int temp = input[i];
		input[i] = pivot;
		input[p] = temp;
		return i;
	}

}
