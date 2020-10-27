package com.onlinejava;

public class Account implements Cloneable {

	private String bankName;
	private long accNo;
	private String accType; // Saving, Sarary, current

	public Account(String bankName, long accNo, String accType) {
		this.bankName = bankName;
		this.accNo = accNo;
		this.accType = accType;
	}

	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

}
