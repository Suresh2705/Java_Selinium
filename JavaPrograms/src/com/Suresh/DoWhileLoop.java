package com.Suresh;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		int j = 50;
		String k=" ";
		do {
			System.out.println(i+k + j);
			i = i + 3;
			j = j - 3;
		} while (i < 50);
		while (j > 0);
	}

}
