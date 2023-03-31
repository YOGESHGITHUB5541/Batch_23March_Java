package org.Day_24th_Constructor;

public class ChainingOfConst3 {
	int a=10;
	public ChainingOfConst3() {
		System.out.println("Default Constructor");
	}
	public ChainingOfConst3(int a, char b) {
		System.out.println("Int Char Constructor");	
	}
	public static void main(String[] args) {
		ChainingOfConst3 obj = new  ChainingOfConst3();
		ChainingOfConst3 obj1 = new  ChainingOfConst3(10,'A');
		obj.test(); 
	}
	public void test() {
		int a=20;
		System.out.println("a1 ="+a);
		System.out.println("a2 ="+this.a);
	}

}
