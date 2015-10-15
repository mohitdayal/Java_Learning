package com.test.java.general.serialization;

import java.io.Serializable;

public class Details implements Serializable{

	String CurrentCompany;
	String prevCompany;
	
	public String getCurrentCompany() {
		return CurrentCompany;
	}
	public void setCurrentCompany(String currentCompany) {
		CurrentCompany = currentCompany;
	}
	public String getPrevCompany() {
		return prevCompany;
	}
	public void setPrevCompany(String prevCompany) {
		this.prevCompany = prevCompany;
	}
	
	
}
