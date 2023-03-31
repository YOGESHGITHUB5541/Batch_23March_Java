package org.ImportantProgram;

public class SwapingTwoNumber {
    //Swaping of two number without using 3rd variable
	public static void main(String[] args) {
	     int a=10, b=20;
	     System.out.println("Before Swapping");
	     System.out.println("a ="+a);
	     System.out.println("b ="+b);
	     a=a+b;  // 10+20=30
	     b=a-b;  // 30-20=10
	     a=a-b; //30-10 = 20
	     System.out.println("After Swapping");
	     System.out.println("a ="+a);
	     System.out.println("b ="+b);
	}

}
