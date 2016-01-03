package com.designpattern.chap11.proxy.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import com.designpattern.chap11.proxy.RemoteInterface;

public class RegisterService
{
	public static void main(String[] args)
	{

		try
		{
			RemoteInterface ri = new RemoteImplementation();
			Naming.rebind("RemoteObject1", ri);

		} catch (RemoteException e)
		{
			
			e.printStackTrace();
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		}

	}
}
