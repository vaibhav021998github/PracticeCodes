package com.test.day12;

import java.util.HashMap;

import javax.print.attribute.HashPrintJobAttributeSet;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hii I am Vaibhav ";
		s=s.toLowerCase().replaceAll(" ", "");
		char []c=s.toCharArray();
		int counter;
		HashMap<Character, Integer>hm=new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			counter=0;
			for (int j = 0; j < c.length; j++) {
				if(c[i]==c[j]) {
					counter++;
				}
				
			}
			hm.put(c[i], counter);
		}
		System.out.println(hm);
	}

}
