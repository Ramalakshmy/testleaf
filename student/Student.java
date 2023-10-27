package org.student;

import org.department.Department;

public class Student extends Department {
	//studentName(),studentDept(),studentId()
	  public void studentName() {
		System.out.println("Student Name");

	}
	 public void studentDept() {
		System.out.println("Student Dept");

	}
	public void studentId() {
		System.out.println("Student Id");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeCode();
		obj.collegeRank();
		obj.collegeName();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
		
		
	}

}
