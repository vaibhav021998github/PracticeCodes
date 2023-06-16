package com.test.day4;

import java.util.HashSet;

public class HashsetPrograms {

	public static void main(String[] args) {
		// HashSet Programs
		HashSet<String>hs=new HashSet<String>();
		hs.add("Bhau");
		hs.add("chhakuli");
		hs.add("Aanna");
		hs.add("chhakuli");//here Hashset not Storing the object 
		System.out.println(hs);//o/p-[Aanna, Bhau, chhakuli]

	}

}
