package com.test.day6;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableProgram {

	public static void main(String[] args) {
	Employee emp=new Employee();
	ArrayList<Employee>list=new ArrayList<Employee>();
	list.add(new Employee(15,"Nikita",52058));
	list.add(new Employee(97,"Shubham",22715));
	list.add(new Employee(21,"Vaibhav",62011));
	Collections.sort(list);
	System.out.println(list);
	}

}
