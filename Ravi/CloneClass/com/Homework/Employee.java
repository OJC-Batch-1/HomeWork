package com.Homework;

public class Employee implements Cloneable {
	private int id, age;
	private String name, designation;
	private double salary;
	private Address address;
	private Account acc;
	
	Employee(String name, String designation, int id, int age, 
			double salary, Address address, Account acc){
		
		this.name = name;
		this.designation = designation;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.acc = acc;
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Address newAd = (Address)this.address.clone();
		Account newAcc = (Account)this.acc.clone();
		Employee newEmp = (Employee)super.clone();
		newEmp.setAddress(newAd);
		return newEmp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

}
