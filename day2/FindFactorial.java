package com.test.day2;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// Program for Finding Factorial...
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " = " + fact);

		sc.close();
	}

}
