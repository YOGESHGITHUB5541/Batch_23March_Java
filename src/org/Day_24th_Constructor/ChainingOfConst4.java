package org.Day_24th_Constructor;
class Super12{
	int a=20;
	public Super12() {
		System.out.println("super12 const");
	}
	public Super12(int a) {
		System.out.println("int a const");
	}
}
public class ChainingOfConst4 extends Super12 {
	public ChainingOfConst4() {
		System.out.println("Default Constructor");
	}
	public ChainingOfConst4(int a, char b) {
		System.out.println("Int Char Constructor");	
	}
	public static void main(String[] args) {
		ChainingOfConst4 obj = new  ChainingOfConst4();
		//ChainingOfConst4 obj1 = new  ChainingOfConst4(20,'C');
		 obj.test();
	
	}
	public void test() {
		int a=10;
		System.out.println("a1 ="+a);
	     System.out.println("a2 ="+super.a);
	}
	

}
