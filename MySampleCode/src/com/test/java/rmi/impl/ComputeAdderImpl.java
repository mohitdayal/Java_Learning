package com.test.java.rmi.impl;

import com.test.java.rmi.interfaces.Compute;
import com.test.java.rmi.interfaces.MyTask;

public class ComputeAdderImpl implements Compute {

	@Override
	public <T> T ComputeResult(MyTask<T> t)  {
		return t.Execute();
	}

	
}
