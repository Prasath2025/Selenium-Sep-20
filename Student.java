package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public static void studentName() {
		
		System.out.println("Prasath");
	}

	public static void studentDept() {
		
		System.out.println("Computer Application");
	}
	
	public static void studentId() {
		
		System.out.println("310398");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student si=new Student();
		Department.deptName();
		College.collegeName();
		College.collegeCode();
		College.collegeRank();
		Student.studentName();
		Student.studentDept();
		Student.studentId();
		
		
		
	}

	}


