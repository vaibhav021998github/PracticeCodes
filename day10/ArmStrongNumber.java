package com.test.day10;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// ArmStrong Number
		int num = 370;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = sum + r * r * r;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");
		}
	}

}
