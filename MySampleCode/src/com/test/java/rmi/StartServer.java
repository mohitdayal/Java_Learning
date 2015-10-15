package com.test.java.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import com.test.java.rmi.impl.ComputeAdderImpl;
import com.test.java.rmi.interfaces.Compute;

public class StartServer {

	public static void main(String[] args) {

		try {

			String name = "Compute";

			Compute adderImpl = new ComputeAdderImpl();

			Compute stub = (Compute) UnicastRemoteObject.exportObject(
					adderImpl, 12345);

			Registry registry = LocateRegistry.getRegistry();

			registry.rebind(name, stub);

			System.out.println("Binding of <" + name
					+ "> completed... Server running...");;

		} catch (Exception e) {

			System.out.println("Caught Exception ..>" + e);
		}
	}
}
