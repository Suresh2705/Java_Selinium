package com.Suresh;

public class Multilevel2 extends Multilevel1 {
	public void phone() {
		System.out.println("Poco M2 Pro");
	}
	public void pc() {
		System.out.println("Lenovo B460e");
	}
	public static void main(String[] args) {
		Multilevel2 m = new Multilevel2();
		m.phone();
		m.bike();
		m.car();
		m.pc();
	}

}
