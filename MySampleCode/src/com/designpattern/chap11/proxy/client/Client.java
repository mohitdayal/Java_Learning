package com.designpattern.chap11.proxy.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.designpattern.chap11.proxy.RemoteInterface;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			RemoteInterface ri = (RemoteInterface) Naming.lookup("RemoteObject1");

			for (int i = 0; i < 20; i++)
			{
				System.out.println(ri.getMessage());
				ri.updateStatus();
				Thread.sleep(1000);
			}

		} catch (MalformedURLException | RemoteException | NotBoundException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
