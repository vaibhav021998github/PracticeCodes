package com.test.day2;

import java.util.Scanner;

public class SwapTwoNumberWithoutThird {

	public static void main(String[] args) {
		// Swapping the Two Numbers without third variable...
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number = ");
		a=sc.nextInt();
		System.out.println("Enter the Number = ");
		b=sc.nextInt();
		System.out.println("Number before Swapping\n"+"a= "+a+"\n"+"b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after Swapping \n"+"a= "+a+"\n"+"b= "+b);
		sc.close();
	}

}
