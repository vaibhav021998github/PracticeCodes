package com.test.day2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// Check Given Number is Odd /Even
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Enter the valid number Which is greater than zero..");
		} else {
			if (num % 2 == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is Odd");
			}
		}
		sc.close();
	}

}
