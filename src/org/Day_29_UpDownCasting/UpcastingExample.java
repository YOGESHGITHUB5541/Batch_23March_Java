package org.Day_29_UpDownCasting;

class Parent{
	public void test() {
		System.out.println("Parent Test");
	}
}
class Child extends Parent{
	public void test1() {
		System.out.println("Child Test1");
	}
}


public class UpcastingExample {
	public static void main(String[] args) {
		Parent obj1 = (Parent) new Child ();
		Parent obj2 = (Parent) new Child ();
		
		obj1.test();
		obj2.test();

	}

}
