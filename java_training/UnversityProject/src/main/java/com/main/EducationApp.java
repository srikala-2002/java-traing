package com.main;

import com.model.Department;
import com.model.Student;
import com.service.DepartmentImp;
import com.service.DepartmentService;
public class EducationApp {

	public static void main(String[] args) {
		Student student1= new Student(1, "venkat", 30);
		Student student2= new Student(2, "tirupati", 50);
		Student student3= new Student(3, "shiva", 40);
	Department department= new Department();
	department.setDepId(22);
	department.setName("eee");
	Student [] students = new Student[3];
	students[0]=student1;
	students[1]=student2;
	students[2]=student3;
	department.setStudent(students);
DepartmentService departmentService = new DepartmentImp();
Student student =departmentService.searchStudent(department, 24);
if(student!=null) {
	System.out.println("student number"+student.getStudId());
	System.out.println("student name"+student.getStudName());
	System.out.println("student age"+student.getAge());
}
	}
}
