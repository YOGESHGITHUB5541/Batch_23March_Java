package org.Day_24th_Abstraction;
abstract class Ex2 {

	abstract public void test1();  //Abstract method

	public void test2() {            //concrete method
		System.out.println("Test 2");
	}

}
public class AbstractionEx2 {
	public static void main(String[]args) {
		//abstract class obj
		Ex2 obj = new Ex2() {
			public void test1() {
				System.out.println("Test 1");
			}
			
		};   
		obj.test1();
		obj.test2();

	}


}
