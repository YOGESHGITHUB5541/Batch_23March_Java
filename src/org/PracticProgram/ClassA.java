package org.PracticProgram;

class B{
	String str = "XYZ";
	public void test() {
		System.out.println("parent test");
	}
}


public class ClassA extends B{
	String str = "ABC";
	public void test() {
		System.out.println("child test");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new ClassA();
		obj.test();
		obj1.test();
		System.out.println(obj.str);
		System.out.println(obj1.str);
	}

}
