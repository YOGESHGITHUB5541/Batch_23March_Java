package org.Day_24th_Constructor;

public class ParaConEx1 {
	public ParaConEx1() {
		System.out.println("Default Constructor");	
	}
	public ParaConEx1(int a) {
		System.out.println("Para- Int Construction");
	}
	public ParaConEx1(float f1, float f2) {
		System.out.println("Para- float f1, float f2 constructor");
	}
	public ParaConEx1(double d1, int a) {
		System.out.println("Para -double d1, int a constructor");
	}
	public ParaConEx1(char ch) {
		System.out.println("Para- charactor constructor");
	}
	public ParaConEx1(boolean f) {
		System.out.println("Para- boolean constructor");
	}
	public static void main(String[]args) {
		ParaConEx1 obj = new ParaConEx1();
		ParaConEx1 ob2 = new ParaConEx1(10);
		ParaConEx1 obj3 = new ParaConEx1(10.20f,30f);
		ParaConEx1 obj4 = new ParaConEx1('A');
		ParaConEx1 obj5 = new ParaConEx1(10.45,80);
		ParaConEx1 obj6 = new ParaConEx1(true);
		
		
	}

}
