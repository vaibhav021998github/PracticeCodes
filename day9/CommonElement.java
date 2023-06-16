package com.test.day9;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {
		// Find Common Element
		String[] a = { "Vaibhav", "Nikita", "Shubham" };
		String[] b = { "Nikita", "Darshan" };
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					hs.add(a[i]);
				}
			}
		System.out.println("Common Elemenet are : " + hs);

	}

}
