package org.Day_25th_Inheritance;
//multi level Inheritance
class Ex1{
	public Ex1(){
		System.out.println("Default Constructor");	
	}
	public void test1() {
		System.out.println("Test 1");
	}
}
class Ex2 extends Ex1{
	public void test2() {
		System.out.println("Test 2");
	}
}
public class MultiLevelEx2 extends Ex2 {
	public void test3() {
		System.out.println("Test 3");
	}
	public static void main(String[]args) {
		MultiLevelEx2 obj = new MultiLevelEx2();
		obj.test1();
		obj.test2();
		obj.test3();
		
	}
}
	

