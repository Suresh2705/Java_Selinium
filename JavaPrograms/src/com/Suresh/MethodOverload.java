package com.Suresh;

public class MethodOverload {
	public void suresh() {
		String s1 = "Full Name is Suresh Arumugam";
		System.out.println("Suresh Details listed below:");
		System.out.println(s1);
	}

	public void suresh(int a) {
		System.out.println("Enter your age: " + a);
	}

	public void suresh(long l) {
		System.out.println("Enter your mobile no: " + l);
	}

	public static void main(String[] args) {
		MethodOverload mt = new MethodOverload();
		mt.suresh();
		mt.suresh(32);
		mt.suresh(9942424067l);
	}

}
