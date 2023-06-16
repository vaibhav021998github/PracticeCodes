package com.test.day2;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse String
		String s = "Nature";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i); // Logic for reverse the String...
		}
		System.out.println("Reverse String = " + reverse);
		System.out.println("====================================================================\n");
		StringBuffer sb=new StringBuffer("Dadu");
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
