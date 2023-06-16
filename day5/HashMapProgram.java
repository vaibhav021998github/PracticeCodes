package com.test.day5;

import java.util.HashMap;

import javax.print.attribute.HashPrintJobAttributeSet;

public class HashMapProgram {
	public static HashMap<Integer, String> getHashMap(){
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1,"Vaibhav");
		hm.put(2,"Nikita");
		hm.put(3,"Shubham");
		return hm;
	}

	public static void main(String[] args) {
		// How to return HashMap...also Different method to iterate...
		//FIRST WAY 
		HashMapProgram hmp=new HashMapProgram();
		System.out.println("First Way :-"+hmp.getHashMap());
		//Second Way
		HashMap<Integer, String>hm1=hmp.getHashMap();
		System.out.println("Second Way :-"+hm1);

	}

}
