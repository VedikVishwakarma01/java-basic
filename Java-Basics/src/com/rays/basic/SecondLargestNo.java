package com.rays.basic;

public class SecondLargestNo {
	
	public static void main(String[] args) {
		
		int[] num = { 39, 90, 67, 435, 65, 32};
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
	
	
}
