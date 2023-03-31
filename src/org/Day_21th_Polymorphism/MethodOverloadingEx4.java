package org.Day_21th_Polymorphism;

public class MethodOverloadingEx4 {
	public static void main(String[] args) {
		MethodOverloadingEx4 obj = new MethodOverloadingEx4();
		obj.test();
		obj.test(0);
		obj.test(0, 0);
		obj.test(0);
	}
	public void test() {
		System.out.println("No parameter");
	}
	public void test(int a) {
		System.out.println("Int parameter");
	}
	public void test(int a, float b) {
		System.out.println("Int and Float Parameter");
	}
	public void test(double a) {
		System.out.println("Double Parameter");
	}
}	
