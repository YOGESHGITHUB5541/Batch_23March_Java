package org.Day_25th_Inheritance;
//Hierarchical parent class extends in child class 
//one parent ,multiple child
class ParentEx20{
	public ParentEx20() {
		System.out.println("ParentEx1 Default const");
	}
	public void test() {
		System.out.println("ParentEx1 test");
	}
}
class childEx1 extends ParentEx20 {
	public childEx1() {
		System.out.println("childEx1 Default Const");
	}
	public void test1() {
		System.out.println("childEx1 test1");
	}
}
class childEx2 extends ParentEx20{
	public childEx2() {
		System.out.println("childEx2 Default Const");
	}
	public void test2() {
		System.out.println("childEx2 test2");
	}
}

public class HierarchicalEx3 extends ParentEx20{
	public void test3() {
		System.out.println("HierarchicalEx3 test3");
	}
	public static void main(String[]args) {
		HierarchicalEx3 obj= new HierarchicalEx3();
		obj.test();
		obj.test3();
		
		
		
	}

}
