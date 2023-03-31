package org.Day_26_Interface;

interface Interface{
	public static final int a=0;
	public int addition(int a, int b);
	public int subtraction(int c, int d);
	public static void test() {
		System.out.println("Static method Test");
	}
	 default void test1() {
		System.out.println("Default Method Test 1");
	}
}
public class ChildClass2 implements Interface {	
	public static void main(String[] args) {
		ChildClass2 obj = new ChildClass2();
		
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.subtraction(30, 10));
		obj.test1();
		Interface.test();
	}

	@Override
	public int addition(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	@Override
	public int subtraction(int c, int d) {
		int sub=c-d;
		return sub;
	}
}
