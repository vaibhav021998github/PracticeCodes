package com.test.day3;

import java.util.Arrays;
import java.util.List;

public class StreamProgramFindEvenOddNumber {

	public static void main(String[] args) {
		// Find the Even Odd Numbers from the list...
		List<Integer>list=Arrays.asList(12,15,19,17,24);
		System.out.println("Odd Numbers => ");
		list.stream().filter(n->n%2!=0).forEach(System.out::println);
		System.out.println("Even Numbers => ");
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
