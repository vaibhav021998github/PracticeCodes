package com.test.day9;

public class PalindromeString {

	public static void main(String[] args) {
		// palindrome String
		String a="mam";
		String temp=a;
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}if(temp.equals(rev)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}

	}

}
