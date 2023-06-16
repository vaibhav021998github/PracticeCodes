package com.test.day14;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamProgram {

	
	public static void main(String[] args) {
		// MAX NO
		List<Integer>list=Arrays.asList(10,15,25,50,100,50);
//		int max = list.stream().max(Integer::compare).get();
//		System.out.println(max);
		
		//MIN NO
//		int min=list.stream().min(Integer::compare).get();
//		System.out.println(min);
		
		// Second Max No.
		
//		int secHigh=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();	
//		System.out.println(secHigh);
		
		//Second Min No.
		
//		int secLow=list.stream().sorted().skip(1).findFirst().get();
//		System.out.println(secLow);
		
		//find the Duplicate
		
//		Set<Integer>set=new HashSet<Integer>();
//		List<Integer> duplicate = list.stream().filter(s->!set.add(s)).collect(Collectors.toList());
//		System.out.println(duplicate);
		
		
	}

}
