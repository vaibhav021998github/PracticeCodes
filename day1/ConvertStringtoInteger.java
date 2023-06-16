package com.test.day1;

public class ConvertStringtoInteger {

	public static void main(String[] args) {
		// Converting String to Integer
		String s="200";
		int i=Integer.parseInt(s);
		System.out.println(s+100);//200100 because + is string concatenation operator 
		System.out.println(i+100);//300 because + is binary plus operator 

	}

}
