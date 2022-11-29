package com.Suresh;

public class Inheritance2 extends Inheritance1{
	public void work1() {
		System.out.println("Suresh Started his carreer as Latex Trainee at \"TNQ books & Journals pvt ltd\", Thiruvanmiyur, Chennai");
	}
	public void work2() {
		System.out.println("Then he moved to \"Cenveo Publishers (I) pvt ltd\", Kilpauk, Chennai");
	}
public static void main(String[] args) {
	Inheritance2 i = new Inheritance2();
	i.priscl();
	i.hiscl();
	i.sdryscl();
	i.college();
	i.work1();
	i.work2();	
}
}
