package com.designpattern.chap5.singleton;

public class DoubleCheckGetInstance
{

	private static volatile DoubleCheckGetInstance singleInst;

	private DoubleCheckGetInstance()
	{
	}

	public static DoubleCheckGetInstance getInstance()
	{
		if (singleInst == null)
		{
			synchronized (DoubleCheckGetInstance.class)
			{
				if (singleInst == null)
				{
					singleInst = new DoubleCheckGetInstance();
				}
			}
		}

		return singleInst;
	}

}
