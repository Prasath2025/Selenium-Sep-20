package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	

	public static void main(String[] args) {
		int[] data = {0,2,15,8,6,3};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.println(data[data.length-2]);
	}

}
