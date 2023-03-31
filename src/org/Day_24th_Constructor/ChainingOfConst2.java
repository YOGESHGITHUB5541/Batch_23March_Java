package org.Day_24th_Constructor;

class SuperClass{
	public SuperClass() {
		System.out.println("Super class Default");
	}
	public SuperClass(int a) {
		System.out.println("Super INT");
	}
}

public class ChainingOfConst2 extends SuperClass{
	public ChainingOfConst2() {
		super();
		System.out.println("Default Constructor");
		
	}
	public ChainingOfConst2(int a, char b) {
		super(10);
		System.out.println("Int Char Constructor");	
	}
	public static void main(String[] args) {
		 ChainingOfConst2 obj = new  ChainingOfConst2();
		 ChainingOfConst2 obj1 = new  ChainingOfConst2(20,'C');
	}

}
