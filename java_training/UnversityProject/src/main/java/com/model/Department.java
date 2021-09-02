package com.model;

public class Department {
private int depId;
private String name;
private Student[] student;
public Department() {
	super();
}
public Department(int depId, String name, Student[] student) {
	super();
	this.depId = depId;
	this.name = name;
	this.student = student;
}
public int getDepId() {
	return depId;
}
public void setDepId(int depId) {
	this.depId = depId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student[] getStudent() {
	return student;
}
public void setStudent(Student[] student) {
	this.student = student;
}
}
