package com.test.day11;

public class PirmeNumber {

	public static void main(String[] args) {
		int num=97; 
		int counter=0;
		
		for(int i=1;i<=num;i++) {
			if(num!=0 && num%i==0) {
				counter++;
				}
			}if(counter==2) {
				System.out.println("No is Prime");
			}else {
				System.out.println("No is Composite");
			}
		}

	}


