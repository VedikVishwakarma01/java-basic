package com.rays.basic;

public class InnerLoopOuterLoop {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}





