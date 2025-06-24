package com.rays.basic;

public class LargestNoFunction {
	
	public void LargestNoFunction(int[] num) {
		
		int largest = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		System.out.println("largest no in array: " + largest);
		
	}
	
	public static void main(String[] args) {
		
		LargestNoFunction n = new LargestNoFunction();
		
		int[] num = {56, 78, 89, 45, 36, 90, 456, 76} ;
		
		n.LargestNoFunction(num);
	}

}
