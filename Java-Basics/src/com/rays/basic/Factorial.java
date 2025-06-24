package com.rays.basic;

public class Factorial {
	public static void main(String[] args) {
		
		int num = 5;
		long factorial = 1;
		
		if (num < 0) {
			System.out.println("factorial does not exist for negative numbers");
			
		}else {
			for(int i = 1; i <= num; i++) {
				factorial *= i ;
			}
			System.out.println("factorial of " + num + " is: " + factorial);
		}
	}

}
