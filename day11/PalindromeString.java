package com.test.day11;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "maa";
		String temp=s;
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}if(reverse.equals(temp)) {
			System.out.println("Palindrom String");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
