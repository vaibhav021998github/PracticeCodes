package com.test.day1;

public class ConvertIntegertoString {

	public static void main(String[] args) {
		// Converting Integer to String
		int i=200;
		String s=String.valueOf(i);
		System.out.println(i+100);//300 because + is binary plus operator
		System.out.println(s+100);//200100 because + is string concatenation operator 
	}

}
