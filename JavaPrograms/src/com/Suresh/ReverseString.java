package com.Suresh;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to Reverse:");
		String s = sc.nextLine();
		System.out.println("Original String: " +s);
		System.out.print("Reversed String: ");
		for (int i = s.length()-1; i>=0; i--) {
			char c=s.charAt(i);
			System.out.print(c);
		}
	}

}
