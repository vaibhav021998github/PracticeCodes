package com.test.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHighestLowestNumber {

	public static void main(String[] args) {
		// Find Second Highest Number from list...
		List<Integer>list=Arrays.asList(54,213,41,99,101);
		
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).
				distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number = "+secondHighest);
		
		//Find Second Lowest Number from list...
		int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second Lowest Number = "+secondLowest);
		

	}

}
