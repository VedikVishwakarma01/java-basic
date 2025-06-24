package com.rays.basic;

public class TestArray {
	public static void main(String[] args) {
		
		System.out.println("----int array-----");
		
		int[] i = {2, 9, 6, 3, 1, 7};
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		System.out.println("----for each loop----");
		
		for (int b : i) {
			System.out.println(b);
		}
		
		System.out.println("----string array----");
		
		String[] s = {"harry", "john", "aman", "aniket"};
		
		System.out.println(s[0]);
		System.out.println(s[2]);
		
		System.out.println("----for each loop----");
		
		for (String j : s) {
			System.out.println(j);
		}
		
	}

}
