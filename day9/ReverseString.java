package com.test.day9;

public class ReverseString {

	public static void main(String[] args) {
		// To Reverse String
		String s = "Maharaj";
		s = s.toLowerCase();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String : " + rev);
	}

}
