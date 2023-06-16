package com.test.day11;

public class SwappingWithoutThird {

	public static void main(String[] args) {
		//Swap the number without third Number
		int a=10;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping "+a+" "+b);
	}

}
