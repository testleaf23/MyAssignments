package week1.day2.assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		 
		int[] num = {23,45,67,32,89,22};
		Arrays.sort(num);
		System.out.println("The given numbers are in sorted order:");
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("The second smallest number:" +num[1]);
	}

}
