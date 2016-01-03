package com.designpattern.chap11.proxy.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.designpattern.chap11.proxy.RemoteInterface;

public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int msgCount = 0;

	protected RemoteImplementation() throws RemoteException
	{
	}

	@Override
	public String getMessage() throws RemoteException
	{
		return "Message Count= " + msgCount;
	}

	@Override
	public void updateStatus() throws RemoteException
	{
		msgCount++;
		System.out.println("Call received from client: " + msgCount);
	}

}
