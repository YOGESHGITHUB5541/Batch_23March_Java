package org.Day_33th_ExceptionHandling;

public class ExceptionBasic {
	public void test() {
		int a= 10/0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		ExceptionBasic obj = new ExceptionBasic();
		obj.test();
		
		System.out.println("Program Ends");

	}

}
