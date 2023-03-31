package org.Day_25th_Inheritance;
//Hierarchical parent class extends in child class 
class Parent6{
	public void test1() {
		System.out.println("Test 1");
	}
}
class child1 extends Parent6{
	public void test2() {
		System.out.println("Test 2");
	}
}
class child2 extends Parent6{
	public void test3() {
		System.out.println("Test 3");
	}
}
class child3 extends Parent6{
    public void test4() {
    	System.out.println("Test 4");
    }
}
public class HierarchicalEx2 extends Parent6 {
	public static void main(String[]args) {
		HierarchicalEx2 obj = new HierarchicalEx2();
		obj.test1();
		
	}

}
