package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println("date before format = " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("date after format = " + sdf.format(date));
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = format1.format(date);
		System.out.println("format1 : " + strDate);
		
		SimpleDateFormat format2 = new SimpleDateFormat("MMM dd, yyyy");
		strDate = format2.format(date);
		System.out.println("format2 : " + strDate);
		
		Date pDate = format1.parse("02/02/2002");
		System.out.println(pDate);
		
		
	}

}
