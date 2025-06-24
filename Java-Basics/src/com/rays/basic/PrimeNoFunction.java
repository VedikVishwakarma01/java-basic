package com.rays.basic;

public class PrimeNoFunction {
	int count = 0;
	
	public void isPrime(int[] i) {
		
		for (int a : i) {
			for (int j = 2; j < a; j++) {
				
				if (a % j == 0) {
					count++;
				}
				
			}
			if (count != 0) {
				System.out.println(a + " is not a prime number");
				count = 0;
			}else {
				System.out.println(a + " is a prime number");
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrimeNoFunction n  = new PrimeNoFunction();
		int[] i = {5, 6, 7, 8, 9, 12, 5, 34, 6, 3, 17};
		n.isPrime(i);
	}

}
