package com.test.day11;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ramraj";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}System.out.println("Reverse String : "+rev);

	}

}
