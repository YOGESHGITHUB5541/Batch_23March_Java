package org.Day_25th_Inheritance;
//Multi Level Inheritance
class Parent1{             
	public void test1() {
		System.out.println("Parent1 Test 1");
	}
}
class Parent2 extends Parent1{
	public void test2() {
		System.out.println("Parent2 Test 2 ");
	}
}

public class MultiLevelEx1 extends Parent2 { 
	public void test3(){
		System.out.println("Test 3");
	}
	public static void main(String[] args) {
		MultiLevelEx1 obj = new MultiLevelEx1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
	}
	public void test4() {
		System.out.println("Test 4");
	}
	public void test5() {
		System.out.println("Test 5");
	}

}

