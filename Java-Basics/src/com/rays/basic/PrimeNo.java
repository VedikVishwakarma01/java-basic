package com.rays.basic;

public class PrimeNo {
	public static void main(String[] args) {
		
		int i = 101;
		int count = 0;
		
		for (int j = 2; j < i; j++) {
			if(i % j == 0) {
				count++;
			}
			
		}
		if(count > 0) {
			System.out.println(i + " is not a prime number");
		}else {
			System.out.println(i + " is a prime number");
		}
		
	}

}