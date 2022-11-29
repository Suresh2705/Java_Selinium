package com.Suresh;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the number to find Palindrome: ");
		int org = sca.nextInt();
		sca.close();
		int check = org;
		int rev = 0;
		while (org > 0) {
			int remain = org % 10;
			rev = rev * 10 + remain;
			org = org / 10;
		}
		System.out.println(rev);

		if (rev == check) {
			System.out.println("The input number is Palindrome");
		} else {
			System.out.println("The input number is not Palindrome");
		}
	}
}