package com.onlinejava;

public class Address implements Cloneable {

	private String firstLine;
	private String secondLine;
	private int zipCode;
	private String state;

	public Address(String firstLine, String secondLine, int zipCode, String state) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.zipCode = zipCode;
		this.state = state;
	}

	public Object Clone() throws CloneNotSupportedException {
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
