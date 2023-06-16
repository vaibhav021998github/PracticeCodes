package com.test.day3;

import java.util.HashSet;

public class FindCommonElement {

	public static void main(String[] args) {
		// Find The Common Character of Element...
		String s1[]= {"Ram","Raj","Samir","Darshan"};
		String s2[]= {"Rajaram","Samir","Darshan"};
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if (s1[i].equalsIgnoreCase(s2[j])) {
					set.add(s1[i]);
				}
			}
			
		}
		System.out.println("Common Element :"+set);
		

	}

}
