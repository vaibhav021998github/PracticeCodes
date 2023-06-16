package com.test.day13;

import java.util.HashMap;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vaibhav";
		s=s.toLowerCase().replace(" ", "");
		char []c=s.toCharArray();
		int counter;
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
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
