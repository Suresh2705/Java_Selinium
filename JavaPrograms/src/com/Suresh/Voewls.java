package com.Suresh;

import java.util.Scanner;

public class Voewls {
	public static void main(String[] args) {
		int v = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to find vowel & consonants: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0; i<=s.length()-1; i++) {
			char ch = s.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}else if(ch!=' ') {
				c++;
			}
			else {
				
			}
		}
		System.out.println("Vowels:" +v);
		System.out.println("Consonants: "+c);
	}
}
