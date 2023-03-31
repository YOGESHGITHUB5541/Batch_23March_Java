package org.ImportantProgram;

public class SwapingUse3rdVar {
 //sSwaping of two number by using 3rd variable
	public static void main(String[] args) {
		int a=10, b=20, temp=0;
		System.out.println("Before Swapping");
	     System.out.println("a ="+a);
	     System.out.println("b ="+b);
	     System.out.println("temp ="+temp);
		temp=a;   //temp = 10
		a=b;      //a=20
		b=temp;   //b=10
		System.out.println("After Swapping");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("temp ="+temp);
		

	}

}
