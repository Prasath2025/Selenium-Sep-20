package week1.day2;

public class AmStrongNumber {

	public static void main(String[] args) {
		
		int input = 153; 
		int orgValue= input;
		int rem;
		int sum = 0;
		
		while(input>0)
		{
			rem=input % 10;
					input = input / 10;
					sum=sum + (rem*rem*rem);
					
		}
		if (sum == orgValue) {
			System.out.println("it is amstrong number");
		}
		
		else {
			System.out.println( "it is not amstrong number");
		
		
		}
	}

}
