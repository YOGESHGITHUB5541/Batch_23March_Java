package org.Day_8th_StaticNonstatic;
class Prorgam2{
	public void sum() {
		int a=10, b=20, c;
		c=a+b;
		System.out.println("sum ="+c);
	
	}
	public void sub() {
		int a=30, b=20, c;
		c= a-b;
		System.out.println("sub ="+c);
	}
}
public class Program3 {
	public static void main(String[]args) {
		Prorgam2 obj = new Prorgam2();
		System.out.println("Program Start");
		obj.sum(); //call methods by object name
		obj.sub(); //call methods by object name
		System.out.println("Program Ends");
	}
}
	