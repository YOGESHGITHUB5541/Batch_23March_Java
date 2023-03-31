package org.Day_14th_SwapingNumber;

public class SwapingTwoNumberEx2 {

	public static void main(String[] args) {
		int x=10, y=20;
		System.out.println("Before swaping");
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		System.out.println("After Swaping");
		x=x+y; //10+20=30
		y=x-y; //30-20=10
		x=x-y; //30-10=20
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		
	

	}

}
