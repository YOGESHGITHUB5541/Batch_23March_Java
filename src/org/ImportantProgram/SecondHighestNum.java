package org.ImportantProgram;

public class SecondHighestNum {
	public static void main(String[] args) {
		int ar[]= {10,20,30,50,77,};
		int max=ar[0];
		int secondmax=max;
	
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				secondmax=max;
				max=ar[i];		
			}
		}
		System.out.println("Second Highest Number = "+secondmax);
	}
}
