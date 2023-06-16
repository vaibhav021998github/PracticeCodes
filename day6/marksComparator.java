package com.test.day6;

import java.util.Comparator;

public class marksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	if(o1.getPercentage()<o2.getPercentage()) {
		return 1;
	}else if(o1.getPercentage()>o2.getPercentage()) {
		return -1;
	}
		return 0;
	}


}
