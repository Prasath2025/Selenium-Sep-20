package week1.day2;

public class SwitchCases {

	public static void main(String[] args) {
		int a=9;
		int b=5;
		String str="mul";
switch (str) {
case "add":
	System.out.println("addition : "+(a+b));
	break;
case "sub":
	System.out.println("subtractiom : "+(a-b));
	break;
case "mul":
	System.out.println("multiplication : "+(a*b));
	break;
case "div":
	System.out.println("division : "+(a/b));
	break;
	
default:
	System.out.println("no operation is performed");
	break;
}

	}

}
