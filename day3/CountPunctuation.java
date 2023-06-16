package com.test.day3;

public class CountPunctuation {

	public static void main(String[] args) {
		// Count Puntuation
		String s = "Hii...,How are you ?";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '.' || ch == '?' || ch == ',') {
				count++;
			}
		}
		System.out.println("No.of Puntuation in a String = " + count);
	}

}
