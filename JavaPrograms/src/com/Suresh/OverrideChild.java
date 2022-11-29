package com.Suresh;

public class OverrideChild extends OverrideParent{
	private void ezhil() {
		System.out.println("Studying 6th standard");
	}
	
	private void keerthana() {
		System.out.println("Studying 4th standard");
	}
	
	private void iniya() {
		System.out.println("Studying 2nd standard");
	}
	
	@Override
	public void priya(String s) {
		System.out.println("Education qualification: "+s);
		super.priya(s);
	}
	
	@Override
	public void yogu(String s) {
		System.out.println("Education qualification: "+s);
		super.yogu(s);
	}
	
	@Override
	public void sezhin(String s) {
		System.out.println("Education qualification: "+s);
		super.sezhin(s);
	}
	
	public static void main(String[] args) {
		OverrideChild r = new OverrideChild();
		r.priya("M.phil");
		r.yogu("9th Std");
		r.ezhil();
		r.keerthana();
		r.iniya();
		r.sezhin("LKG");
	}

}
