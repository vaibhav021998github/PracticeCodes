package com.test.day2;

public class RecursionUsingFactorialNumber {

	public static void main(String[] args) {
		// Recursion Factorial Number
		System.out.println("Recursion of 5 = " + factorial(5));

	}

	private static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
