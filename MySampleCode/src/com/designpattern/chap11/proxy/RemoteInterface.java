package com.designpattern.chap11.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote
{
	String getMessage() throws RemoteException;
	
	void updateStatus() throws RemoteException;
	
}
