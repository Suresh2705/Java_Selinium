package com.Suresh;

public class InterfaceChild implements InterfaceParent1, InterfaceParent2, InterfaceParent3 {
	@Override
	public void book() {
		System.out.println("Ponniyin Selvan");
	}

	@Override
	public void bus() {
		System.out.println("Town bus No. 11");
	}

	@Override
	public void school() {
		System.out.println("Govt. Higher Secondary School");
	}

	@Override
	public void street() {
		System.out.println("Senthamizh Nagar");
	}

	@Override
	public void village() {
		System.out.println("Thanipadi");
	}

	@Override
	public void dist() {
		System.out.println("Tiruvannamalai");
	}

	@Override
	public void taluk() {
		System.out.println("Thandarampet");
	}

	@Override
	public void city() {
		System.out.println("Vellore");
	}

	public static void main(String[] args) {
		InterfaceChild i = new InterfaceChild();
		i.book();
		i.street();
		i.school();
		i.bus();
		i.village();
		i.taluk();
		i.dist();
		i.city();
	}
}
