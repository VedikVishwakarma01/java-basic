package com.rays.basic;

public class ArmstrongNo {
	public static void main(String[] args) {
		
		int n = 1634;
		int temp = n;
		int r = 0;
		int rn = 0;
		
		while (temp > 0) {
			
			r = temp % 10;
			rn = rn + r*r*r*r;
			temp = temp / 10;
			
		}
		
		System.out.println(rn);
		
		if(n == rn) {
			System.out.println("this is armstrong no");
		}else {
			System.out.println("this is not an armstrong no");
		}
	   	
	}
	

}
