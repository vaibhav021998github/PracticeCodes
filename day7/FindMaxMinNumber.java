package com.test.day7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		// To Find Out Max and Min Number from the list..
		
		List<Integer>list=Arrays.asList(56,13,98,14,21);
		//Find Out max Number...
		int maxNumber = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number = "+maxNumber);
		
		//Find Out min Number...
		int minNumber = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number = "+minNumber);
	}

}
