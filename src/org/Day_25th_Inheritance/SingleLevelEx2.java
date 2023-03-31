package org.Day_25th_Inheritance;
//single level inheritance one parent, one child class
class ParentEx2{  
	public ParentEx2() {  //constructor
		System.out.println("Parent Default Constructor");
	}
	public void test() {  //method of parent class
		System.out.println("Parent Test");
	}
}

public class SingleLevelEx2 extends ParentEx2 {
	public SingleLevelEx2() {
		System.out.println("Child Default Constructor");
	}
	public void test1() {
		System.out.println("Child Test 1");
	}
	public static void main(String[]args) {
		System.out.println("**** Program Starts ***");
		SingleLevelEx2 obj = new SingleLevelEx2();
		
		obj.test1();
		obj.test();
		System.out.println("*** Program Ends *****");
		
	}

}
