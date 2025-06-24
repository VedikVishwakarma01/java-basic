package com.rays.basic;

public class OccurrenceOfCharacter {
	public static void main(String[] args) {
		
		String name = "Rays technologies";
		
		int count = 0;
		
		for(char a = 'A'; a <= 'z'; a++) {
			
			for (int i = 0; i < name.length(); i++) {
				if (a == name.charAt(i)) {
					count++;
				}
			}
			if(count != 0) {
				System.out.println(a + " = " +count);
				count = 0;
			}
		}
	}

}
