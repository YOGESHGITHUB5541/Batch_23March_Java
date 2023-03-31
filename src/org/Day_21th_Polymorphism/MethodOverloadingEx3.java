package org.Day_21th_Polymorphism;

public class MethodOverloadingEx3 {
	public static void main(String[] args) {
		 MethodOverloadingEx3 obj = new  MethodOverloadingEx3();
		 obj.test();
		 obj.test(30);
		 obj.test(10.5f, 60);
		 obj.test(50, 30.40f);
		 obj.test(false);
		
	}
	public void test() {
		System.out.println("Parameter is 0");
	}
	public void test(int a) {
		System.out.println("Parameter is int ");
	}
	public void test(int a, float b) {
		System.out.println("Parameter is int and float");
	}
	public void test(float a, double b) {
		System.out.println("Parameter float and double");
	}
	public void test(boolean a) {
		System.out.println("Parameter is Boolean");
	}
}	
