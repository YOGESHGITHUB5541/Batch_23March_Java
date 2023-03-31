package org.Day_30th_TightLooseCoupling;

interface ParentInter{
	public void test();
}
class Child1 implements ParentInter {
	public Child1(char ch) {   //Parameterized constructor
		
	}
	public void test() {
		System.out.println("child1 Implemented test");
	}
}
class child2 implements ParentInter{
	public void test() {
		System.out.println("child2 implemented test");
	}
}


public class LooseCoupling2 {
	public static void main(String[] args) {
		child2 obj = new child2();
		obj.test();
	}

}
