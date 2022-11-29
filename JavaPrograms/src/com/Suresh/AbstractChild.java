package com.Suresh;

public class AbstractChild extends AbstractParent {
	//String s = "Tamil Ilakkiya Noolgal";
	@Override
	public void ilakkiyam() {
		System.out.println("Tamil Ilakkiya Noolgal");
	}
	@Override
	public void puthinam() {
		System.out.println("Tamil Puthinangal");
	}
	@Override
	public void novel() {
		System.out.println("Ponniyin Selvan");		
	}
	
	public static void main(String[] args) {
		AbstractChild abs = new AbstractChild();
		abs.ilakkiyam();
		abs.puthinam();
		abs.novel();
		
	}
	

}
