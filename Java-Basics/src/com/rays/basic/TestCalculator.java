package com.rays.basic;

import java.util.Scanner;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		long firstNo = 0;
		long secondNo = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		firstNo = sc.nextInt();
		System.out.println("Enter your second number:");
		secondNo = sc.nextInt();
		
		System.out.println("first number is = " + firstNo + " and second number is = " + secondNo);
		
		System.out.println("select your operation + or - or * or / ");
		
		String operation = "";
		operation = sc.next();
		
		switch(operation) {
		case "+":
			System.out.println("result = " + (firstNo + secondNo));
			break;
		case "-":
			System.out.println("result = " + (firstNo - secondNo));
			break;
		case "*":
			System.out.println("result = " + (firstNo * secondNo));
			break;
		case "/":
			System.out.println("result = " + (firstNo / secondNo));
			break;
			
		}
	}

}
