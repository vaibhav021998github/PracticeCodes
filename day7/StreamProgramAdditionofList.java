package com.test.day7;

import java.util.Arrays;
import java.util.List;

public class StreamProgramAdditionofList {

	public static void main(String[] args) {
		// Stream Program For Addition of list element...
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		Integer sum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println("Addition of all numbers = "+sum);
		

	}

}
