package com.Suresh;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s = sca.nextLine();

		System.out.println("Enter your reg no: ");
		int a = sca.nextInt();

		System.out.println("Enter your 5 subject marks: ");
		int tamil = sca.nextInt();
		int eng = sca.nextInt();
		int maths = sca.nextInt();
		int science = sca.nextInt();
		int social = sca.nextInt();

		int total = (tamil + eng + maths + science + social);
		int avg = (total/5);//sca.nextInt

		System.out.println("Student name: " + s);
		System.out.println("Register no: " + a);
		System.out.println("Total Marks: " + total);
		System.out.println("Average Percentage of marks: " + avg);
		
		if (avg==100) {
			System.out.println("Centum");
		}
		else if (avg>90) {
			System.out.println("First class with A+ Grade");
		}
		else if (avg>80) {
			System.out.println("First class with Distinction");
		}
		else if (avg>60) {
			System.out.println("Pass with First class");
		}
		else if (avg>50) {
			System.out.println("Pass with Second class");
		}
		else if (avg>35) {
			System.out.println("Pass with Third class");
		}
		else {
			System.out.println("fail");
		}

	}

}