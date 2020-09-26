package week3.day1;

import org.student.Student;

public class Studentt {
	
public void getStudentInfo(int i,String name) {
		
		System.out.println("Student id:"+i);
		System.out.println("Student name: " +name);
		}
	public void getStudentInfo(String email,long phone) {
		
		System.out.println("Student email: " +email);
		System.out.println("Student phone: " +phone);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt si=new Studentt();
		si.getStudentInfo(11, "prasath");
		si.getStudentInfo("prasathsmart789@gmail.com", 709231630);



	
	}

}
