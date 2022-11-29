package com.Suresh;

public class MethodOverride extends MethodOverload {
	private void suresh(char c) {
		System.out.println("Initial is: "+c);
	}
	@Override
	public void suresh(int a) {
		//System.out.println("In 2023 my age is: "+a);
		super.suresh(a);
	}
	@Override
	public void suresh(long l) {
		//System.out.println("Enter your phone number: "+l);
		super.suresh(l);
	}
	public static void main(String[] args) {
		MethodOverride obj=new MethodOverride(); //This helps to get the own class and also parent class methods.
		//MethodOverload obj=new MethodOverride(); //This helps to get the methods only from parent class.
		obj.suresh();
		obj.suresh('A');
		obj.suresh(33);		
		obj.suresh(8608450650l);
	}
	

}
