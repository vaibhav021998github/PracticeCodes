package com.test.day11;

import java.util.Scanner;

public class FibonanciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("No.of terms for series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 3; i <= n; i++) {
			
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			
		}
	}

}
