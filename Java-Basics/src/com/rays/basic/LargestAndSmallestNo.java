package com.rays.basic;

public class LargestAndSmallestNo {
	
	public void findLargestAndSmallest(int[] num) {
		
		int largest = num[0];
		int smallest = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
			if (num[i] < smallest) {
				smallest = num[i];
			}

		}
		System.out.println("Largest number in array: " + largest);
		System.out.println("Smallest number in array: " + smallest);
	}	
	
	public static void main(String[] args) {
		
		LargestAndSmallestNo obj = new LargestAndSmallestNo();
		
		int[] num = {56, 78, 89, 45, 36, 90, 456, 76};
		
		obj.findLargestAndSmallest(num);
	}

}

