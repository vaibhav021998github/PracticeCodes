package com.test.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram2 {

	public static void main(String[] args) {
		// HashMap Program 2
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "CSK");
		hm.put(2, "GT");
		hm.put(3, "MI");
		hm.put(4, "LSG");
//		System.out.println(hm.get(3));// to get perticular value when we know the respective key 
		// First way - To use entry interface to get key and values 
		/*for(Entry<Integer, String> e:hm.entrySet()){
			System.out.println("Key:- "+e.getKey()+"\nValue :- "+e.getValue());
		}*/
		//Second way - TO use keyset to get key and values
		Set<Integer>set=hm.keySet();
		for(Integer i:set) {
//			System.out.println(i);
			System.out.println(hm.get(i));
		}
		
	}

}
