package org.Day_25th_Inheritance;

class ClassA{
	int a=10, b=20;
	public void test1(){
		System.out.println("Test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}
}

public class SuperKeyword extends ClassA {
	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.childMethod();
	}
	protected void childMethod() {
		System.out.println(super.a);
		System.out.println(super.b);
		super.test1();
		super.test2();
	}
	

}
