package com.test.java.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {
	
	<T> T ComputeResult(MyTask<T> t) throws RemoteException;

}
