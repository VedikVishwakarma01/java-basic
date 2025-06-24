package com.rays.basic;

public class PrintAllCharacter {
	public static void main(String[] args) {
		
		String str = "potter";
		
		int countH = 0;
		int countA = 0;
		int countR = 0;
		int countY = 0;
		int countU = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch == 'p') {
				countH++;
			}if(ch == 'o') {
				countA++;
			}if (ch == 't') {
				countR++;
			}if (ch == 'e') {
				countY++;
			}if (ch == 'r') {
				countU++;
			}
		}System.out.println("p character = " + countH);
		System.out.println("o character = " + countA);
		System.out.println("t character = " + countR);
		System.out.println("e character = " + countY);
		System.out.println("r character = " + countY);

	}

}
