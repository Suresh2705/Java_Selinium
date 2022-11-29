package com.Suresh;

public class Inheritance3 extends Inheritance2 {
	private void work3() {
		int ir=2018;
		String d=", He joined in \"SPI Global pvt ltd\" as Latex Executive";
		System.out.println("In " +ir +d);
	}
	private void work4() {
		int rd=2022;
		String ss=", He joined \"Newgen Knowledgeworks Pvt ltd\" as Latex paginator";
		System.out.println("In "+rd +ss);

	}
public static void main(String[] args) {
	Inheritance3 in3 = new Inheritance3();
	in3.priscl();
	in3.hiscl();
	in3.sdryscl();
	in3.college();
	in3.work1();
	in3.work2();
	in3.work3();
	in3.work4();
}
}
