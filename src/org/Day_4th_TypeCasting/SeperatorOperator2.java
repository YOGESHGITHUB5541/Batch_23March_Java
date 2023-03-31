package org.Day_4th_TypeCasting;

public class SeperatorOperator2 {
	public static void main(String[]args) {
		SeperatorOperator2 obj = new SeperatorOperator2();
		int a=10, b=20;
		String s= "java";
		System.out.println(s+a*b); //java200
		System.out.println(a*b+s); //200java
		obj.test();
	}
	public void test() {
		int x=5;
		int y=x--;
		int z=++x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
