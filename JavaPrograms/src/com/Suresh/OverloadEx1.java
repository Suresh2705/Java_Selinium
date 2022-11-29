package com.Suresh;

public class OverloadEx1 {
	public void suresh() {
		System.out.println("Vizhaiya");
	}
	public void suresh(String s,int i) {
		System.out.println("Enter your name: "+s);
		System.out.println("Enter your age: "+i);
	}
	public void suresh (long l, char c) {
		System.out.println("Enter your mobile no: "+l);
		System.out.println("Enter your initial: "+c);
	}
	public void suresh (float f) {
		System.out.println(f);
	}
	
	public static void main (String [] args) {
		OverloadEx1 o = new OverloadEx1();
		o.suresh(250.852f);
		o.suresh(9942424067l, 'A');
		o.suresh("Suresh", 32);
	}
}
