package org.Day_21th_Polymorphism;

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		MethodOverloadingEx1 obj = new MethodOverloadingEx1();
		obj.addition();
		obj.addition(10);
		obj.addition(40,50);
		obj.addition(10.5f,80,100);
		
	}
	public int addition() {
		int a=10, b=20;
		int add=a+b;
		System.out.println("Addition1 ="+add);
		return add;
	}
	public int addition(int x) {
		
		int add=x;
		System.out.println("Addition 2="+add);
	    return add;
	}
	public int addition(int x, int y) {
		
		int add=x+y;
		System.out.println("Addition3 ="+add);
		return add;
	}
	public int addition(float x, int y,int z) {
		
		int add=(int)x+y+z;
		System.out.println("Addition4 ="+add);
		return add;
	}

}
