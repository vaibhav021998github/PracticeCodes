package com.test.day7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {

	public static void main(String[] args) {
		// Sort List Ascending Order...
		List<Integer> list = Arrays.asList(1, 5, 9, 7, 2, 5, 7, 10);
		List<Integer> ascendingOrder = list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Ascending Order = " + ascendingOrder);

		// Sort List Descending Order...
		List<Integer> descendingOrder = list.stream().sorted(Comparator.reverseOrder()).distinct()
				.collect(Collectors.toList());
		System.out.println("Descending Order = " + descendingOrder);
	}

}
