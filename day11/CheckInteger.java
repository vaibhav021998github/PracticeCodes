package com.test.day11;

import java.util.Scanner;

public class CheckInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Number");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()) {
		System.out.println("No is integer");	
		}else {
			System.out.println("No is not an Integer");
		}
	}

}
