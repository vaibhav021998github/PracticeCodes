package com.test.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		// ArrayList Programs
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee(101,"Vaibhav","Akole"));
		al.add(new Employee(105,"Shubham","Malegoan"));
		//USING FOR-EACH LOOP 
		for(Employee emp:al) {
			System.out.println(emp);
		}
		System.out.println("=========================================================================");
		//Using Iterator
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}
		System.out.println("=========================================================================");
		System.out.println("Size Of list "+al.size());
		System.out.println("=========================================================================");
		//USING FOR LOOP
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//this is synchronized list
		List<Employee> synchronizedList = Collections.synchronizedList(al);
		System.out.println(synchronizedList);
	}

}
