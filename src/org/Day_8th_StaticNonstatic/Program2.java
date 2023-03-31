package org.Day_8th_StaticNonstatic;
class Prorgam1{
	public static void sum() {
		int a=10, b=20, c;
		c=a+b;
		System.out.println("sum ="+c);
	
	}
	public static void sub() {
		int a=30, b=20, c;
		c= a-b;
		System.out.println("sub ="+c);
	}
}
public class Program2 {
	public static void main(String[]args) {
		System.out.println("Program Start");
		Prorgam1.sum(); //call methods by class name
		Prorgam1.sub(); //call methods by class name
		System.out.println("Program Ends");
	}
}
	