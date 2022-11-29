package com.Suresh;

public class Reverse {
	public static void main(String[] args) {
		String t = "Good Morning";
		System.out.println("Original String: " + t);
		System.out.print("Revesed String: ");
		for (int n = t.length() - 1; n >= 0; n--) {
			char a = t.charAt(n);
			System.out.print(a);
		}
		
		System.out.println("");

		String s = "Welcome to Java";
		System.out.println("Original String: " + s);
		System.out.print("Revesed String: ");
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			System.out.print(c);
		}

	}
}
