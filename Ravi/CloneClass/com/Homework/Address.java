package com.Homework;

public class Address implements Cloneable {
	private String firstLine, secondLine, state;
	private int zipCode;
	
	Address(String firstLine, String secondLine, String state, int zipCode){
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	

}
