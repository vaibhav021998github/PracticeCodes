package com.test.day12;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hii hey";
		s = s.toLowerCase().replace(" ", "");
		char[] c = s.toCharArray();
		HashSet<Character>hs=new HashSet<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					hs.add(c[i]);
				}
			}
		}System.out.println(hs);

	}
}