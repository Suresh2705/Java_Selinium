package com.Suresh;

import java.util.Scanner;

public class FamilyRelationship {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter any value: ");
		String a = sca.next();
		//int a = sca.nextInt();
		switch(a) {
		//case 1:{
		case "Priya":{
			System.out.println("Head of the family");
			break;
		}
		//case 2:{
		case "Suresh":{
			System.out.println("Husband of the family head");
			break;
		}
		//case 3:{
		case "Sezhin":{
			System.out.println("Son");
			break;
		}
		//case 4:{
		case "Vizhaiya":{
			System.out.println("Daughter");
			break;
		}
		default:{
			System.out.println("Invalid value");
			break;
		}
		
		}
		
	}

}
