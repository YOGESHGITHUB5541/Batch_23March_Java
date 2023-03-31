package org.Day_24th_Abstraction;
abstract class Ex1 {
     int a=10;
	abstract public void test1();//incomplete method means abstract
	public void test2() {        //complete method means concrete method
		System.out.println("Test 2");
	}

}
public class AbstractionEx1 {
	public static void main(String[]args) {
		AbstractionEx1 obj = new AbstractionEx1();
		obj.test1();
		obj.test2();
	}
	public void test1() {
		System.out.println("Test 1"); 
	}
	public void test2() {
		System.out.println("Test 2");
	}

}
