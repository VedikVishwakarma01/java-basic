package com.rays.basic;

public class ReverseNo {
	public static void main(String[] args) {
		
		int n = 153;
		                // we can also reverse the number without using temp
		int r = 0;
		int rn = 0;
		
		while (n > 0) {
			
			r = n % 10;     // modulus is used to get remainder (last digit)
			rn = rn * 10 + r;  // build the reverse no
			n = n / 10;  // to remove last digit
			
			
			
			
		}
		System.out.println("reverse no is: " + rn);
	}
	

}
