package com.rays.basic;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] num = {20,90,40,60,30,80,70,40,20,10,30,};
		int temp = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
	}

}
