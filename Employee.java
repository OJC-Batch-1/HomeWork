package com.onlinejava;

public class Employee implements Cloneable {

	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;

	private Address address;

	private Account acc;

	public Employee(int id, String name, int age, String designation, double salary, Address address, Account acc) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.acc = acc;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(Employee emp) {
		if (emp == null) {
			return false;
		}
		if (this.id != emp.id) {
			return false;
		}
		if (this.name != emp.name)
			return false;
		if (this.age != emp.age)
			return false;
		if (this.designation != emp.designation)
			return false;
		if (this.salary != emp.salary)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
