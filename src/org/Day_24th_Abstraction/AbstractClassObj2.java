package org.Day_24th_Abstraction;
abstract class Parent2{
	public void test1() {
		System.out.println("Test 1"); // concrete method
	}
	public void test2() {               //concrete method
		System.out.println("Test 2");
	}
}
public class AbstractClassObj2 {
	public static void main(String[] args) {
		Parent2 obj = new Parent2() {}; //in abstract class all method is concrete 
		obj.test1();                   //so obj body is complete
		obj.test2();

	}

}
