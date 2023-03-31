package org.Day_24th_Abstraction;
abstract class Ex6{
	
	abstract public void test1();
	abstract public void test2();
	
	public void test3() {
		System.out.println("Test 3");
	}
	public void test4() {
		System.out.println("Test 4");
	}
}
public class AbstractEx5 extends Ex6 {
	public void test1() {
		System.out.println("test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}
	public static void main(String[] args) {
		 AbstractEx5 obj = new  AbstractEx5();
		 obj.test1();
		 obj.test2();
		 obj.test3();
		 obj.test4();
	
		
		
	}

}
