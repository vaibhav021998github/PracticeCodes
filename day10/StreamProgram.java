package com.test.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamProgram {

	public static void main(String[] args) {
		// Stream Programs
		// MAX NO
		List<Integer> list = Arrays.asList(15, 89, 10, 46, 17);
		int maxNum = list.stream().max(Integer::compare).get();
		System.out.println("Maximum No. in a given : " + maxNum);
		// MIN NO
		int minNum = list.stream().min(Integer::compare).get();
		System.out.println("Minimum No. in a given : " + minNum);
		// Second Highest no.
		int secHighNo = list.stream().sorted(Collections.reverseOrder())
				.distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number : "+secHighNo);
		//Second lowest no.
		int secLowNo = list.stream().sorted().skip(1).findFirst().get();
		System.out.println("Second Lowest Number : "+secLowNo);

	}

}
