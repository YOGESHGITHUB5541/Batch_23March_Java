package org.Day_21th_Polymorphism;

class Parent2{
	public  void test1(int a) {
		System.out.println("Parent Test 1");
	}
	public void test2(int a, int b) {
		System.out.println("Parent Test 2");
	}
	public void main() {
		System.out.println("Parent Test 3");
	}	
}
public class MethodOverridingEx2 extends Parent2 {
	public void test1(int a) {
		System.out.println("child test1"); //implementation of parent test1 method
	}
	public void test2(int a, int b) {
		System.out.println("child test2"); ////implementation of parent test2 method
	}
	public void main() {
		System.out.println("child test3");
	}
	
	public static void main(String[] args) {
		MethodOverridingEx2 obj = new MethodOverridingEx2();
		obj.test1(10);
		obj.test2(2,2);
		obj.main();
		obj.test4();
		
	}
	public void test4() {
		System.out.println("Test 4");
	}
}	


