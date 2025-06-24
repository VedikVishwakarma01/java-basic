package com.rays.basic;

public class EvenOddFunction {

	public void isOddEven(int[] i) {

		for (int a : i) {

			if (a % 2 == 0) {
				System.out.println(a + " is an even number");
			} else {
				System.out.println(a + " is a odd number");
			}
		}

	}

	public static void main(String[] args) {
		EvenOddFunction n = new EvenOddFunction();
		int[] i = { 2, 5, 6, 8, 9, 12, 14, 17 };
		n.isOddEven(i);
		int[] i2 = {2, 4, 3, 5, 6, 7, 8};
		n.isOddEven(i2);
	}

}
