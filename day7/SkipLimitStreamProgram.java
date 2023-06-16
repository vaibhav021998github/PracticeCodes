package com.test.day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitStreamProgram {

	public static void main(String[] args) {
		// Use Of Limit() and Skip()
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> limitUse = list.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limit Use = "+limitUse );
		
		//Sum of limit(5)...
		int sum = list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println("Sum of limit 5 numbers = "+sum);
		
		//Use of Skip()
		List<Integer> skipUse = list.stream().skip(5).collect(Collectors.toList());
		System.out.println("Skip use = "+skipUse);
		
		//Sum of other than Skip numbers
		int sumOfSkip = list.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println("Sum of Skip 5 numbers = "+sumOfSkip);
		
		
		

	}

}
