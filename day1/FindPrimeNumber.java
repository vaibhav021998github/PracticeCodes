package com.test.day1;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// Find the prime number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt(), counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				counter++;
			}

		}
		if (counter == 2) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is Composite");
		}
  		sc.close();
	}

}
