package com.Suresh;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		// int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to find palindrome: ");
		String org = sc.nextLine();
		sc.close();
		// org.toLowerCase();
		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--) {
			char c = org.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);

		// rev.toLowerCase();
		if (rev.equals(org)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}

	}

}
