package com.Suresh;

public class UpcastingChild extends UpcastingParent{//In Upcasting child class has no methods
	public static void main(String[] args) {
		//ChildClass obj = new ChildClass(); //Used to Polymorphism and general object Using extends
		UpcastingParent obj = new UpcastingChild(); //Upcasting using extends   
		//UpcastingParent obj = new UpcastingParent(); //Upcasting Without using extends
		obj.bike();
		obj.gold();
		obj.land();
		obj.phone();
	}

}
