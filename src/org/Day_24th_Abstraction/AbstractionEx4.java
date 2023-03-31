package org.Day_24th_Abstraction;
abstract class Ex4 {

	abstract public void test1();
	abstract public void test2();


}
public class AbstractionEx4 {

	public static void main(String[]args) {
		Ex4 obj = new Ex4 () {    //abstract class obj
			public void test1() {
				System.out.println("test 1");
			}
			public void test2() {
				System.out.println("test 2");
			}
		};
		obj.test1();
		obj.test2();

	}


}
