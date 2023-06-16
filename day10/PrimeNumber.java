package com.test.day10;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=20,counter=0;
		for(int i=1;i<=num;i++) {
			if(num!=0 && num%i==0) {
				counter++;
			}
		}if(counter==2) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Composite");
		}
	}

}
