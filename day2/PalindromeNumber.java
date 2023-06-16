package com.test.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		//Program for Palindrome Number
		int num=159;
		int temp=num;
		int reverse=0;
		while(num>0) {
			reverse=reverse*10+num%10;
			num/=10;
		}if(temp==reverse) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}

	}

}
