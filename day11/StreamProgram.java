package com.test.day11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(45, 89, 111, 52);
		int maxNum = list.stream().max(Integer::compare).get();
		System.out.println(maxNum);
		int minNum = list.stream().min(Integer::compare).get();
		System.out.println(minNum);
		int secHigh = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secHigh);
		int secMin=list.stream().sorted().skip(1).findFirst().get();
		System.out.println(secMin);
		List<Integer> collect = list.stream().filter(n->n>50).collect(Collectors.toList());
		System.out.println(collect);   
	}

}
