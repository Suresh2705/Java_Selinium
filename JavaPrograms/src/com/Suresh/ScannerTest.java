package com.Suresh;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String s1 = s.nextLine();
		
		System.out.println("Enter your address: ");
		String s2 = s.nextLine();
		
		System.out.println("Enter your Mobile no: ");
		long l = s.nextLong();
		
		System.out.println("Enter your Weight: ");
		float w = s.nextFloat();
		
		System.out.println("Enter your Height: ");
		int h = s.nextInt();
		
		float bmi = (h/w);
				
		System.out.println("Your name: "+s1);
		System.out.println("Your address: "+s2);
		System.out.println("Your Mobile no: "+l);
		System.out.println("Your Weight: "+w +" kg");
		System.out.println("Your Height: "+h +" cm");
		System.out.println("Your BMI is: "+bmi);
		
		if (bmi==21) {
			System.out.println("You are fit");
		}
		else if(bmi>21) {
			System.out.println("You are fat");
		}
		else {//if (bmi<21) 
			System.out.println("You are weak");
		}
	}
	
}

/// 1st name--> Address---> Mobile(Long)-->weight(decimal)--> height(byte)
//--> body weight and height avg (Float)