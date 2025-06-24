package com.rays.basic;

public class Methods {
	
	public void sum(int a, int b) {
		System.out.println("sum of two numbers: " + (a + b));
	}
	
	public int sum2(int a, int b) {
		return a + b;
	}
	
	public void multiply(int a, int b) {
		System.out.println("multiplication of two numbers: " + (a * b));
	}
	
	public int multiply2(int a, int b) {
		return a * b;
	}
	
	public void substraction(int a, int b) {
		System.out.println("substraction of two numbers: " + (a - b)); 
	}
	
	public int substraction2(int a, int b) {
		return a - b;
	}
	
	public void greeting(String a, String b) {
		System.out.println(a + b);
	}
	
	public String greeting2(String name) {
		return "Hello " + name;
	}

}
