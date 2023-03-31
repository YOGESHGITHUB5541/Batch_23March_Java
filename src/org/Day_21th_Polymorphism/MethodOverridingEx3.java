package org.Day_21th_Polymorphism;
class Parent1{
	public void test() {
		System.out.println("Test");
	}
	public void test1() {
		System.out.println("Test 1");
	}
	
}
public class MethodOverridingEx3 extends Parent1 {
	public void test() {
		System.out.println("Implement Test");
	}
	public void test1() {
		System.out.println("Implement Test1");
	}

	public static void main(String[] args) {
		MethodOverridingEx3 obj = new MethodOverridingEx3();
		obj.test();
		obj.test1();

	}

}
