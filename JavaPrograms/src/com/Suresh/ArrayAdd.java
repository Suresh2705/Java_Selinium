package com.Suresh;

import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sca.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for 1st array: ");

		int i;
		for (i = 0; i < n; i++) {
			a[i] = sca.nextInt();
		}

		int b[] = new int[n];
		System.out.println("Enter the elements for 2nd array: ");

		int j;
		for (j = 0; j < n; j++) {
			b[j] = sca.nextInt();
		}

		System.out.println("1st Array: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("2nd Array: ");
		for (j = 0; j < n - 1; j++) {
			System.out.println(b[j]);
		}
		System.out.println("Addition of 2 arrays: ");
//		int k;
//		int c[] = new int[n];
//		for (k = 0; k < n - 1; k++) {
//			for (i = 0; i < n; i++) {
//				for (j = 0; j < n; j++) {
//					c[i] = a[i] + b[i];
//				}
//			}
//		}
//		System.out.println(c[i]);

		sca.close();

	}

}
