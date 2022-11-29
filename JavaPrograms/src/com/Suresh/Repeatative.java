package com.Suresh;

import java.util.Scanner;

public class Repeatative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String spl[] = s.split(" ");
		int count;
		for (int i = 0; i <= spl.length - 1; i++) {
			count = 1;
			for (int j = i + 1; j <= spl.length - 1; j++) {
				if (spl[i].equals(spl[j])) {
					count++;
					spl[j] = "$";
				}
			}
			if (spl[i] != "$") {
				System.out.println(spl[i] + ": " + count);
			}
		}
	}
}
