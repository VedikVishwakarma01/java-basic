package com.rays.basic;

public class SecondLargestNoFunction {
	
	public void SecondLargestNoFunction(int[] num) {
		
		int temp = 0;
		int secLargest = 0;
		
		for (int i = 0; i < num.length; i++) {
			if(temp < num[i]) {
				secLargest = temp;
				temp = num[i];
			}
			if (secLargest < num[i] && temp > num[i]) {
				secLargest = num[i];
			}
		}
		System.out.println("second largest no in array: " + secLargest);
	}
	
	public static void main(String[] args) {
		
		SecondLargestNoFunction n = new SecondLargestNoFunction();
		
		int[] num = {56, 78, 89, 45, 36, 90, 456, 76} ;
		
		n.SecondLargestNoFunction(num);
	}
	

}
