package org.Day_14th_SwapingNumber;

public class SwapingTwoNumberEx3 {

	public static void main(String[] args) {
		int m=50, n=60;
		System.out.println("Before Swaping");
		System.out.println("m ="+m);
		System.out.println("n ="+n);
		System.out.println("After swaping");
		m=m+n; //50+60=110
		n=m-n; //110-60=50
		m=m-n; //110-50=60
		System.out.println("m ="+m);
		System.out.println("n ="+n);
		
	

	}

}
