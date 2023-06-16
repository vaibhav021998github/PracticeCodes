package com.test.day3;

public class CountCharacter {

	public static void main(String[] args) {
		// Count no. of Character...
		// Logic 1
//		String s1 = "Hii I am Vaibhav";
//		s1 = s1.replaceAll(" ", "");
//		int a = s1.length();
//		System.out.println("Count of Chracter :" + a);

		// Logic 2
		String s2 = "Hii Recruiter";
		s2 = s2.replaceAll(" ", "");
		int count = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("No. of Chracter : " + count);
	}

}
