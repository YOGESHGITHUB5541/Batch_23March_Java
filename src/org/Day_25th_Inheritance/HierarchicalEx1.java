package org.Day_25th_Inheritance;
//Hierarchical parent class extends in child class 
class A{
	public void test1() {
		System.out.println("Class A Test1");
	}
}
class B extends A{
	public void test2(){
		System.out.println("Class B Test2");
	}
}
class c extends A{
	public void test3() {
		System.out.println("class c Test3");
	}
}
class D extends A{
	public void test4() {
		System.out.println("Class D test4");
	}
}
public class HierarchicalEx1 extends A {
	public static void main(String[]args) {
		HierarchicalEx1 obj = new HierarchicalEx1();
	//	B obj1 = new B();
		A u=new B();
		u.test1();
		obj.test1();
		//obj1.test2();
	}

}
