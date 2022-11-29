package com.Suresh;

public class ReverseTask {
	//Output: olleh doog gninrom
	public static void main(String []args){
		String s = "Hello Good Morning";
		String s1 = s.toLowerCase();
		String s2[] = s1.split(" ");
		int i;
		int j;
		int k;
		int l;
		for (i=0; i<=s2.length-1; i++){
		System.out.println(s2[i]);
		}
		String rev1 = "";
		String rev2 = "";
		String rev3 = "";
		for(j=s2[0].length()-1; j>0; i--){
		char ch1 = s2[0].charAt(j);
		rev1 = rev1+ch1;
		System.out.print(rev1);
		}
		

	}
}
