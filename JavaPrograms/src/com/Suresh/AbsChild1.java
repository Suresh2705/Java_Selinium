package com.Suresh;

public class AbsChild1 extends AbsParent {
	@Override
	public void chennai(String s, int i) {
		System.out.println(s);
		System.out.println("My pincode is: "+i);
	}
	@Override
	public void madurai(String s1) {
		System.out.println(s1);
	}
	@Override
	public void salem(String s2) {
		System.out.println(s2);
	}
	public static void main(String[] args) {
		AbsChild1 a = new AbsChild1();
		a.chennai("Capital of TamilNadu", 600082);
		a.madurai("Thoonga Nagaram");
		a.salem("Famous for Mango");
	}
	
	

}
