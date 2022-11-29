package com.Suresh;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String ss = s.nextLine();

		System.out.println("Enter your register no: ");
		int i = s.nextInt();

		System.out.println("Enter your marks: ");
		int j = s.nextInt();
		int k = s.nextInt();
		int l = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		
		int o = (j+k+l+m+n);
		int p = (o/5);

		System.out.println("Name of the Student: "+ss);
		System.out.println("Register Number: "+i);
		System.out.println("Total marks: "+o);
		System.out.println("Average of total marks: "+p);
	}

}
