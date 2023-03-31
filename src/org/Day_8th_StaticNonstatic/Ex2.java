package org.Day_8th_StaticNonstatic;

public class Ex2 {
	static int a=10;

	public static void main(String[] args) {
		Ex2 obj =new Ex2();
		System.out.println("*** program start ****");
		
		//static variable in static method
		System.out.println("A ="+a); //by name
		System.out.println("A1 ="+obj.a);//by object
		System.out.println("A3 ="+Ex2.a);//by class name
		
		//static to static method
		test1();//by name
		obj.test1();//by object
		Ex2.test1(); //by class name
		System.out.println("*** program end ***");
	}
	public static void test1() {
		long d=10 ,d1=30;
		long sum=d+d1;
		System.out.println("sum ="+sum);
		
	}

}
