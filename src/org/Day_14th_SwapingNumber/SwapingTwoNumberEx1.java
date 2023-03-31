package org.Day_14th_SwapingNumber;

public class SwapingTwoNumberEx1 {

	public static void main(String[] args) {
		int a=5, b=10;
//		System.out.println("Before Swaping");
//		System.out.println("a ="+a);
//		System.out.println("b ="+b);
//		System.out.println("After Swaping");
		a=a+b; //5+10=15
		b=a-b; //15-10=5
		a=a-b; //15-5=10
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	

	}

}
