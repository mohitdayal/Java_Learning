package com.test.java.general.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveInstance {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.seteFName("Mohit");
		employee.seteLName("Dayal");
		employee.setmEmpID(999);
		employee.setSSN(11111);
		employee.setCurrentCompany("Siemens");
		employee.setPrevCompany("HCL");
		
			try {
//				File f = new File("/Mohit.ser");
				File f = new File("test.ser");
				String path = f.getAbsolutePath();
				FileOutputStream fileOutputStream  = new FileOutputStream(path);
				ObjectOutputStream  outputStream = new ObjectOutputStream(fileOutputStream);
				outputStream.writeObject(employee);
				outputStream.close();
				fileOutputStream.close();
				System.out.println("serialization done");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
