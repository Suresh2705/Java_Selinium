package com.Suresh;

public class ReverseStringArray {
	public static void main(String[] args) {
		System.out.println("Reverse String using Array");
		System.out.println("--------------------------");
		String s = "Java Selinium - Automation Testing";
		System.out.println("Input text: "+s);
		String a[] = s.split(" ");
		System.out.print("Reversed text: ");
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}
}
