package org.Day_25th_Inheritance;
//multi level Inheritance
class Parent3{
	public Parent3() {
		System.out.println("Parent1 Default Conatructor ");
	}
	public void test1() {
		System.out.println("Parent1 Test1");
	}
}
class Parent4 extends Parent3{
	
	public Parent4() {
		System.out.println("Parent2 Default Constructor");
	}
	public void test3() {
		System.out.println("Parent2 Tets3");
	}
}
public class MultiLevelEx3 extends Parent4 {
	public void test4() {
		System.out.println("Chlid class Test4");
	}
	public static void main(String[]args) {
		MultiLevelEx3 obj = new MultiLevelEx3();
		obj.test1();
		obj.test3();
		obj.test4();
		obj.test5();
	}
	public void test5() {
		System.out.println("Test 5");
	}
}
	

