package com.test.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPrograms {

	public static void main(String[] args) {
		// Stream Program to get Max no, second Highest No. , Min no ,second lowest no.
		List<Integer> list = Arrays.asList(10, 25, 45, 55, 78, 90, 90, 79);
		int maxNo = list.stream().max(Integer::compare).get();
		System.out.println("Maximum Number : " + maxNo);
		// Finding Second Highest Number
		int secHighNo = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number : " + secHighNo);
		// finding Minmum Number
		int minNo = list.stream().min(Integer::compare).get();
		System.out.println("Minimum Number : " + minNo);
		// Finding Second Highest No.
		int secLowNo = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second Lowsest Number : " + secLowNo);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> collectDuplicate = list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
		System.out.println("Duplicate Number : "+collectDuplicate);
	}

}
