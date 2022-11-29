package com.Suresh;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("Enter your average: ");
		int avg = n.nextInt();

		if (avg > 99) {
			System.out.println("Centum");
		} else if (avg > 90) {
			System.out.println("First class with A+ Grade");
		} else if (avg > 80) {
			System.out.println("First class with Distinction");
		} else if (avg > 60) {
			System.out.println("Pass with First class");
		} else if (avg > 50) {
			System.out.println("Pass with Second class");
		} else if (avg > 35) {
			System.out.println("Pass with Third class");
		} else {
			System.out.println("fail");
		}
	}

}
