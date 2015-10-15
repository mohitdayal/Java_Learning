package com.test.java.general.serialization;

import java.io.Serializable;

public class Employee extends Details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String eFName;
	String eLName;
	transient int SSN;
	int mEmpID;
	
	
	public String geteFName() {
		return eFName;
	}
	public void seteFName(String eFName) {
		this.eFName = eFName;
	}
	public String geteLName() {
		return eLName;
	}
	public void seteLName(String eLName) {
		this.eLName = eLName;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getmEmpID() {
		return mEmpID;
	}
	public void setmEmpID(int mEmpID) {
		this.mEmpID = mEmpID;
	}
	
}
