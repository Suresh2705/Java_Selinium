package com.Suresh;

public class Multilevel3 extends Multilevel2 {
	private void land() {
		System.out.println("3.5 cents land");
	}
	private void jewel() {
		System.out.println("2.5 savaran jewels");
	}
	public static void main (String [] args) {
		Multilevel3 m = new Multilevel3();
		m.bike();
		m.car();
		m.jewel();
		m.land();
		m.pc();
		m.phone();
	}

}
