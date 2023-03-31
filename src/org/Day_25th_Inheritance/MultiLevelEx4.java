package org.Day_25th_Inheritance;
//multi level Inheritance
class GrandFather{
	public GrandFather() {
		System.out.println("Grand Father Default Const");
	}
	public void test1() {
		System.out.println("Grand Father Test1");
	}
}
class Father extends GrandFather{
	public Father() {
		System.out.println("Father Default Const");
	}
	public void test2() {
		System.out.println("Father Test2");
	}
}
public class MultiLevelEx4 extends Father{
	public void ChildTest() {
		System.out.println("Child Test");
	}
	public static void main(String[]args) {
		MultiLevelEx4 obj = new MultiLevelEx4();
		obj.test1();
		obj.test2();
		obj.ChildTest();
	
		
	}

}
	

