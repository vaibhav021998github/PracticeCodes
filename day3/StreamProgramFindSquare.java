package com.test.day3;

import java.util.Arrays;
import java.util.List;

public class StreamProgramFindSquare {

	public static void main(String[] args) {
		// Using Stream API find the Square of a Numbers
		List<Integer>list=Arrays.asList(1,3,5,7,12);
		list.stream().map(a->a*a+" ").forEach(System.out::print);

	}

}
