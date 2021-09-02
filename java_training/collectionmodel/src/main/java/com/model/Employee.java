package com.model;

import java.util.Set;

public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	private Set<Address> address;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public Employee(int empNo, String empName, float salary, Set<Address> address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
	}
	

}
