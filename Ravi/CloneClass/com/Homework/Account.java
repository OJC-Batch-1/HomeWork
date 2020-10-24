package com.Homework;

public class Account implements Cloneable{
	private String bankName, accType;
	private long accNo;
	
	public Account(String bankName, String accType, long accNo) {
		this.bankName = bankName;
		this.accType = accType;
		this.accNo = accNo;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	
}
