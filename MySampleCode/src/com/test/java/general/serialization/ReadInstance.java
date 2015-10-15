package com.test.java.general.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadInstance {

	public static void main(String[] args) {
		Employee read;
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dayal00M\\Desktop\\MyData\\Mohit.ser");
			
			ObjectInputStream inputStream = new  ObjectInputStream(fileInputStream);
			
			 read  = (Employee)inputStream.readObject();
			
			 inputStream.close();
			 fileInputStream.close();
			 System.out.println("Serialized Object read sucessfull");
			 System.out.println("Details:--");
			 System.out.println("FName= "+ read.geteFName());
			 System.out.println("LName= "+ read.geteLName());
			 System.out.println("SSN=   "+ read.getSSN());
			 System.out.println("EmpID= "+ read.getmEmpID());
			 System.out.println("CurrentComp= "+ read.getCurrentCompany());
			 System.out.println("PrevComp= "+ read.getPrevCompany());
			 
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
