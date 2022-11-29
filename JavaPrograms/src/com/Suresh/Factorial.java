package com.Suresh;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial: ");
		int a = sc.nextInt();
		int f=1;
		//for (int i=a; i>=1; i--) {
		for (int i=1; i<=a; i++) {
			f = f*i;
		}
		System.out.println(f);
		
		sc.close();
	}

}
