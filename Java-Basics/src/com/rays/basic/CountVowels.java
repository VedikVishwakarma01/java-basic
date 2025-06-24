package com.rays.basic;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String str = "harry";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch == 'h' || ch == 'a' || ch == 'r' || ch == 'r' || ch == 'y') {
			
			count++;
		}
	}
		System.out.println(count);
	
	}
	
	
}
