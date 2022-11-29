package com.Suresh;

public class Inheritance1 {
	public void priscl() {
		String s="Punjayat Union Primary School (North), Thanipadi";
		System.out.println("Suresh Started primary schooling at " +s);
	}
	public void hiscl() {
		String s1= "Govt Higher Secondary School, Thanipadi";
		System.out.println("Suresh completed high school at "+s1);
	}
	public void sdryscl() {
		String s2="Govt Higher Secondary School, Thanipadi";
		System.out.println("Suresh Continued higher school eduction at "+s2);

	}
	public void college() {
		String s3="Govt Arts College, Thiruvannamalai";
		System.out.println("Suresh completed his college at "+s3);
	}
	public static void main(String[] args) {
		Inheritance1 in = new Inheritance1();
		in.priscl();
		in.hiscl();
		in.sdryscl();
		in.college();
	}

}
