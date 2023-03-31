package org.Day_24th_Abstraction;
abstract class Parent1{
	abstract public void test(int a, int b); //abstract method
	abstract public void test1(); //abstract method
} 

public class AbstractClassObj {
	public static void main(String[] args) {
		Parent1 obj = new Parent1() { 
			public void test(int a, int b) { //complete abstract method
				System.out.println("sum ="+(a+b));
			}
			public void test1() { //complete abstract method in obj body
				System.out.println("Test 1");
			}
		};
		obj.test(10, 20);
		obj.test1();

	}

}
