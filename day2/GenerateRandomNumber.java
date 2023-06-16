package com.test.day2;
import java.util.*;
public class GenerateRandomNumber {

	public static void main(String[] args) {
		// Find Random number 0-100...
		Random r=new Random();
		for(int c=1;c<=10;c++) {
			System.out.println(r.nextInt(100));
		}
	}

}
