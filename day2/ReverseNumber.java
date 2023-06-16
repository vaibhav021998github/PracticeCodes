package com.test.day2;

public class ReverseNumber {

	public static void main(String[] args) {
		// Program for Reverse the Number
		int num=1256;
		int reverse=0;
		while(num>0) {
			reverse=reverse*10+num%10;//Logic For Reverse number
			num/=10;
		}
		System.out.println("Reverse Number = "+reverse);

	}

}
