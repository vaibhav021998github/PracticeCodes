package com.test.day10;

public class FactorialProgram {

	public static void main(String[] args) {
		// Factorial program
		int num = 4;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factoroial Number is " + num + " = " + fact);
	}

}
