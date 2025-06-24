package com.rays.basic;

public class PalindromeNo {
	public static void main(String[] args) {
		
		int n = 1331;
		int temp = n;
        int r = 0;
        int rn = 0;

        while (temp > 0) {

            r = temp % 10;    
            rn = rn * 10 + r;  
            temp = temp / 10; 
            
            
            
        }  
        System.out.println(rn);
      if (rn == n) {
    	  System.out.println("this is palindrome no");
    	  
      }
	}

}


