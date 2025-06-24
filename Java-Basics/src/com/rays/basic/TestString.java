package com.rays.basic;

public class TestString {
	
	public static void main(String[] args) {
		
		String name = "Vijjay Dinanath Chouhan";
		
		System.out.println("string length = " + name.length());
		System.out.println("7th character is = " + name.charAt(7));
		System.out.println("Dina index at = " + name.indexOf("Dina"));
		System.out.println("First i postion = " + name.indexOf("i"));
		System.out.println("last i postion = " + name.lastIndexOf("i"));
		System.out.println("a is replaced by b = " + name.replace("a", "b"));
		System.out.println("chhota vijjay = " + name.toLowerCase());
		System.out.println("bada vijjay = " + name.toUpperCase());
		System.out.println("starts with vijjay = " + name.startsWith("Vijjay"));
		System.out.println("ends with vijjay = " + name.endsWith("Vijjay"));
		System.out.println(("Substring = " + name.substring(6)));
		
		
		
	}

}
