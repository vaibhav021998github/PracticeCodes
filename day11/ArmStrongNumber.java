package com.test.day11;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=370;
		int temp=num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			sum=sum+(r*r*r);
			num/=10;
		}if(temp==sum) {
		System.out.println("No.is ArmStrong");
	}else {
		System.out.println("No is Not ArmStrong");
	}
	}
}
