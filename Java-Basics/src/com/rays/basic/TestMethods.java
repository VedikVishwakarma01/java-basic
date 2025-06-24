package com.rays.basic;

public class TestMethods {
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		m.sum(56, 67);
		
		System.out.println(m.sum2(5, 10));
		
		m.multiply(3, 7);
		
		System.out.println(m.multiply2(4, 5));
		
		m.substraction(15, 7);
		
		System.out.println(m.substraction2(24, 83));
		
		m.greeting("hello ", "world");
		
		System.out.println(m.greeting2("World!"));
	}

}




