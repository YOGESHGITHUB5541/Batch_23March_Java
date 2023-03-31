package org.Day_24th_Constructor;

public class ChainingOfConst {
	public ChainingOfConst() {
		this(true);
		System.out.println("Default Constructor");
	}
	public ChainingOfConst(int a, char b) {
		this('b',10.5f);
		System.out.println("Int Char Constructor");	
	}
	public ChainingOfConst(char b, float f) {  
		System.out.println("Char Float Constructor");
	}
	public ChainingOfConst(boolean b) {
		this(10,'b');
		System.out.println("Boolean Constructor");
	}

	public static void main(String[] args) {
		 ChainingOfConst obj = new  ChainingOfConst();
		 
		

	}

}
