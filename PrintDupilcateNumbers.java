package week1.day2;

public class PrintDupilcateNumbers {

	public static void main(String[] args) {
		
		int[] arr = {4,2,3,1,5,0,4,8,6,7,9,8,7,10};
  int count;
  for (int i = 0; i < arr.length-1; i++) {
	  count=0;
	  for(int j=i+1;j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
			  count++;
		  }
	  }
	if(count>0) {
		System.out.println(" "+arr[i]);
	}
}


	}

}
