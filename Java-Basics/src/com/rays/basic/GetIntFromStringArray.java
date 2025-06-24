package com.rays.basic;

public class GetIntFromStringArray {
	public static void main(String[] args) {
		
		String[] str = { "rs45", "vk18", "abd17", "cg333" };
		int count = 0;
		for (String s : str) {
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					count++;
				}
			}
		}
		System.out.println("taotal int = " + count);
		
		int[] n = new int[count];
		System.out.println("length of int array = " + n.length);
		int index = 0;
		
		for (String s : str) {
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					n[index] = Character.getNumericValue(s.charAt(i));
					index++;
				}
			}
		}
		for (int a : n) {
			System.out.println(a);
		}
		
	}

}
