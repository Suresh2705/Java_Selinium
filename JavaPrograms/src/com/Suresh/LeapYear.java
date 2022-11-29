package com.Suresh;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the initial year: ");
		int yr1 = s.nextInt();

		System.out.println("Enter the end year: ");
		int yr2 = s.nextInt();

		int i;
		for (i = yr1; i <= yr2; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i);
			}
		}
	}

}
