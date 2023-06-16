package com.test.day12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPrograms {

	public static void main(String[] args) {
		// Stream Programs...
//		 Sum of Numbers
//		List<Integer>list=Arrays.asList(10,20,50,5,100);
//	Optional<Integer>sum=list.stream().reduce((a,b)->(a+b));
//			System.out.println("Sum of all Integer : "+sum.get());

		// Find Maximum value
//		List<Integer>list=Arrays.asList(10,74,99,106,100);
//		int maxNum=list.stream().max(Integer::compare).get();
//		System.out.println(maxNum);
//			
		// Find minimum Value

//		List<Integer>list=Arrays.asList(10,74,99,106,100);
//		int minNum = list.stream().min(Integer::compare).get();
//		System.out.println(minNum);
//		

		// Find Second Highest Value

		List<Integer> list = Arrays.asList(15, 78, 96, 32, 11, 21,21);
//		int secHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//		System.out.println(secHighest);
//
//		// Find Second Lowest Value
//		int secLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
//		System.out.println(secLowest);
		 
		//Find Duplicate
		Set<Integer>set=new HashSet<Integer>();
		List<Integer> duplicate = list.stream().filter(a->!set.add(a)).collect(Collectors.toList());
		System.out.println("Duplicate of a given number : "+duplicate);
		
		
		
		
		
	}

}
