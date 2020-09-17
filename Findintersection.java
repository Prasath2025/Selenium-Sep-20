package week1.day2;

public class Findintersection {

	public static void main(String[] args) {
		int[] arr1= {6,1,9,5,4,7};	 
		int[] arr2={2,1,8,5,0,7};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
			System.out.println(" " +arr1[i]);	
			}
			}
		}

	}

}
