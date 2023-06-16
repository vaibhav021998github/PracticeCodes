package com.test.day11;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4626;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}System.out.println("Reverse Number : "+rev);
	}

}
