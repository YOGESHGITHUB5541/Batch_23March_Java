package org.Day_24th_Abstraction;
abstract class Ex3 {
	public Ex3() {
		System.out.println("default const");
	}

	 public void test1() {
		 System.out.println("Test 1");
	 }

	public void test2() {
		System.out.println("Test 2");
	}

}
public class AbstractionEx3 {

	public static void main(String[]args) {
		//abstract class obj
		Ex3 obj = new Ex3 () {};
		obj.test1();
		obj.test2();
		
	}
	

}
