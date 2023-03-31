package org.Day_21th_Polymorphism;

public class MethodOverloadingEx2 {

	public static void main(String[] args) {
		MethodOverloadingEx2 obj= new MethodOverloadingEx2();
		test();
		obj.test(10);
		obj.test(10,20);
		obj.test(10,90,30);
		main();
		
	}
	public static void test() {
		System.out.println("Number of Parameter = 0");
	}
	public void test(int a) {
		System.out.println("Number of Parameter = 1");
	}
	public void test(int a,int b) {
		System.out.println("Number of Parameter = 2");
	}
	public void test(int a,int b, int c) {
		System.out.println("Number of Parameter = 3");
	}
	public static void main() {
		System.out.println("main method");
	}
	
}