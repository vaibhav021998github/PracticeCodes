package com.test.day11;

public class PalindromeNumber {

	public static void main(String[] args) {
		// palindrome Number
		int num=122;
		int temp=num;
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}if(rev==temp) {
			System.out.println("No is Palindrome");
		}else {
			System.out.println("No is Not Palindrome");
		}

	}

}
