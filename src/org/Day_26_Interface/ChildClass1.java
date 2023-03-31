package org.Day_26_Interface;

interface InterOne{
	public int addition(int a, int b);
	public int subtraction(int c, int d);		
}

public class ChildClass1 implements InterOne {
	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.addition(10, 20);
		obj.subtraction(30,10);
	}

	@Override
	public int addition(int a, int b) {
		int sum= a+b;
		System.out.println("Addition ="+sum);
		return sum;
	}

	@Override
	public int subtraction(int c, int d) {
		int sub= c-d;
		System.out.println("Subtraction ="+sub);
		return sub;
	}

}
