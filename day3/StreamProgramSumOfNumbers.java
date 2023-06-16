package com.test.day3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamProgramSumOfNumbers {

	public static void main(String[] args) {
		// StreamAPI Program =>Print the Sum of all Numbers...
		List<Integer>list=Arrays.asList(1,5,4,5);
		Optional<Integer> sum = list.stream().reduce((a,b)-> (a+b));
		System.out.println("Sum of all Numbers"+sum.get());

	}

}
