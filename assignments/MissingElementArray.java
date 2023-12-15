package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3,8,6,7};
		int totalLen = arr.length;
		System.out.println("Total length: " +totalLen);
		
		 Arrays.sort(arr);
		for (int i=0; i<totalLen-1;i++) {
			
			if(i != arr[i+1]) {
				System.out.println(i);
				
			}
		}

	}

}
