package org.Day_25th_Inheritance;
//single level inheritance
class ParentEx1{ 
	int a=10, b=20;
	public void test1() {
		System.out.println("You are in Parent Test1");
	}
	public void test2() {
		System.out.println("You are in parent Test 2");
	}
}

public class SingleLevelEx1 extends ParentEx1 {
	
	public void childMethiod() {
		System.out.println("Child Method");
	}
	public static void main(String[]args) {
		SingleLevelEx1 obj = new SingleLevelEx1();
		obj.test1(); //accessing parent method using child object
		obj.test2(); //accessing parent method using child object
		System.out.println(obj.a);//accessing parent variable using child object
		System.out.println(obj.b);//accessing parent variable using child object
		obj.childMethiod();//accessing child method using child object
	}

}
