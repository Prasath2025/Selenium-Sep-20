package org.department;

import org.college.College;

public class Department extends College {
	
	public static void deptName() {
		
		System.out.println("BCA");
	}

	public static void main(String[] args) {
		Department dep=new Department();
		dep.deptName();
			}

}
