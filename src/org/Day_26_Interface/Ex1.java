package org.Day_26_Interface;

interface Inter3{
	default void test() {
		System.out.println("default test method of Inter1");
	}
}
interface Inter4{
	default void test1() {
			System.out.println("default test1 method of Inter1");
	}
}

public class Ex1 implements Inter3,Inter4 {
	public static void main(String[]args) {
		Ex1 obj = new Ex1();
		obj.test();
		obj.test1();
	}

}
