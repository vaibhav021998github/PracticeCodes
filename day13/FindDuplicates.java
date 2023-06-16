package com.test.day13;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		s=s.replace(" ", "");
		char[] c=s.toCharArray();
		HashSet<Character>hs=new HashSet<Character>();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					hs.add(c[i]);
				}
			}
		}System.out.println(hs);

	}

}
