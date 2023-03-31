package org.Day_8th_StaticNonstatic;

public class Ex1 {
	static int a=70; // Global static
	int b=80; //Global non static/instant variable
	
	public static void main(String[] args) {
		System.out.println("**** program Start ****");
		 Ex1 obj = new Ex1();
		//static to static
		System.out.println("A1 ="+a);
		System.out.println("A2 ="+obj.a);
		System.out.println("A3 ="+Ex1.a);
		//static to non static
		System.out.println("B ="+obj.b);
		obj.test1();
		Ex1.test2();
		obj.test3();
		System.out.println("***** program End *****");

	}
	public void test1() {
		int a=10, b=20;
		System.out.println("Sum ="+(a+b));
		System.out.println("Division ="+a/b);
		System.out.println("Subtraction ="+(a-b));
		System.out.println("Multiplication ="+a*b);
		this.test3();

	}
	public static void test2() {
		int a=50, b=30;
		int sum=a+b;
		System.out.println("sum of Test2 ="+sum);
	}
	public void test3() {
		System.out.println("Sanket");
	}
	
	
}
