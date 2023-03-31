package org.Day_25th_Inheritance;
//single level inheritance one parent, one child class
class Ex4{
	public void test1() {
		System.out.println("Test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}
}

public class SingleLevelEx3 extends Ex4 {
	public void test3() {
		System.out.println("Test 3");
	}
	public static void main(String[]args) {
		SingleLevelEx3 obj = new SingleLevelEx3();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
	public void test4() {
		System.out.println("Test 4");
	}

}
