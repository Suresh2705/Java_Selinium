package com.Suresh;

public class InterChild implements InterParent1, InterParent2 {
	private void dinducal() {
		System.out.println("Famous city for lock");
	}

	private void madurai() {
		System.out.println("Thoongaa nagaram");
	}

	@Override
	public void chennai() {
		System.out.println("Capital of Tamil nadu");
	}

	@Override
	public void trichy() {
		System.out.println("Center point of Tamilnadu");
	}

	@Override
	public void covai() {
		System.out.println("Industrial head of Tamilnadu");
	}

	@Override
	public void kumari() {
		System.out.println("Starting point of Tamilnadu");
	}
	
	@Override
	public void salem() {
		System.out.println("Mango city");		
	}
	
	@Override
	public void tiruvannamalai() {
		System.out.println("Temple city");		
	}
	
	public static void main(String[] args) {
		InterChild i = new InterChild();
		i.dinducal();
		i.covai();
		i.chennai();
		i.kumari();
		i.madurai();
		i.salem();
		i.trichy();
		i.tiruvannamalai();
	}

}
