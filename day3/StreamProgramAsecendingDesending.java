package com.test.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgramAsecendingDesending {

	public static void main(String[] args) {
		// Using Stream API Asecending & Desecending Order of a list
		//ASECENDING ORDER
		List<Integer>list=Arrays.asList(1,5,2,6,10,19);
		List<Integer> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list+" ");
		//DESECENDING ORDER
		List<Integer>list1=Arrays.asList(1,5,2,6,19,10);
		//REMAINING....

	}

}
