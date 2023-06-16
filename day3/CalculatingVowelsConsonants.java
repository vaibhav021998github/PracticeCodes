package com.test.day3;

public class CalculatingVowelsConsonants {

	public static void main(String[] args) {
		// Calculating count of vowels ,consonants and spaces...
		String s="Ramraj";
		s=s.replaceAll(" ", "").toLowerCase();
		int countVowels=0,countConsonants=0,countSpaces=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countVowels++;
			}else if (ch>='a'&&ch<='z') {
				countConsonants++;
			}else if(ch==' ') {
				countSpaces++;
			}
		}
		System.out.println("Count of No .of Vowels in given String : "+countVowels);
		System.out.println("Count of No .of Consonants in given String : "+countConsonants);
		System.out.println("Count of No .of Spaces in given String : "+countSpaces);
	}
}
