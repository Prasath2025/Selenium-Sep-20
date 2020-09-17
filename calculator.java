package week1.day2;

public class calculator {
	public int additional(int a,int b) {
		return a + b ;
	}
	
	public double multipulication(int a,int b) {
		return a* b ; 
	}
	public int substraction(int a,int b) {
		
		return a - b ;
	}

	public static void main(String[] args) {
		calculator calc = new calculator();
		
		int additional=calc.additional(10,20);
		System.out.println(additional);
	
		double multipulication=calc.multipulication(10,20);
		System.out.println(multipulication);
	
		int substraction=calc.substraction(10,20);
		System.out.println(substraction);
	
	}

}
