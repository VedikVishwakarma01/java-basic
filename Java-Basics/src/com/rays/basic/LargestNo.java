package com.rays.basic;

public class LargestNo {
	public static void main(String[] args) {
		
		int[] num = {56, 78, 89, 45, 36, 90, 456, 76} ;
		
		int largest = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] > largest) {
				largest = num[i];
			}
		}
		
		System.out.println("largest number in array: " + largest);
	}

}
