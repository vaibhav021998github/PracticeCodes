package com.test.day9;

public class CountVowelsConsonantsSpace {

	public static void main(String[] args) {
		// calculate the no. of vowels, consonants,spaces
		String s = "Vaibhav Chaudhari";
		int vowelsCount = 0, consonantsCount = 0, space = 0;
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonantsCount++;
			} else if (ch ==' ') {
				space++;
			} else {
				System.out.println("Invalid Response");
			}
		}
		System.out.println("No. of Vowels : " + vowelsCount + "\n" + "No. of Consonants : " + consonantsCount + "\n"
				+ "No. of space : " + space);
	}

}
