package com.test.day13;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamProgram {
public static void main(String[] args) {
	//Find Sum 
	
	List<Integer>list=Arrays.asList(10,15,25,50,10,15);
	
//	int sum = list.stream().reduce((a,b)->(a+b)).get();
//	System.out.println(sum);
	
	// Find Max no.
	
//	int maxNo = list.stream().max(Integer::compare).get();
//	System.out.println(maxNo);
	
	// Find Min no.
	
//	int minNo=list.stream().min(Integer::compare).get();
//	System.out.println(minNo);
	
	//Find Second Highest
	
//	Integer secMax = list.stream().
//			sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//	System.out.println(secMax);

	//Find Second Lowest
	
//	int secMin=list.stream().sorted().skip(1).findFirst().get();
//	System.out.println(secMin);
	
	//Find the Duplicate
	
	Set<Integer>set=new HashSet<Integer>();
	List<Integer> dulpicateNumber = list.stream().filter(a->!set.add(a)).collect(Collectors.toList());
	System.out.println(dulpicateNumber);
	
	
	
	
	
	
	
	
	
	
	
}
}
