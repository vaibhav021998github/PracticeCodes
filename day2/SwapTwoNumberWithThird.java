package com.test.day2;

import java.util.Scanner;

public class SwapTwoNumberWithThird {

	public static void main(String[] args) {
		// Swapping of Two Number with Third Number...
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a  =>");
		a=sc.nextInt();
		System.out.println("Enter the b  =>");
		b=sc.nextInt();
		System.out.println("Numbers before Swapping \n"+"a="+a+"\n" +"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after Swapping \n" + "a="+a+"\n" +"b="+b);
		sc.close();
	}

}
