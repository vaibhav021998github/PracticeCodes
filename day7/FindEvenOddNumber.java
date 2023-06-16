package com.test.day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOddNumber {

	public static void main(String[] args) {
		// Filter the list Even & Odd Numbers...
		List<Integer> list = Arrays.asList(12, 17, 19, 18, 22, 23);
		
		// Filer the list Odd Numbers
		List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even No. = " + evenNumber);
		
		// Filer the list Odd Numbers
		List<Integer>oddNumber=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Odd No. = "+oddNumber);
	}

}
