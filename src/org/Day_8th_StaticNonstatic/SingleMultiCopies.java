package org.Day_8th_StaticNonstatic;

public class SingleMultiCopies {
	static int a=10; //global static var
	int x=20; //global non static var or instant var
	public static void main(String[] args) {
		System.out.println("*** Program start ***");
		System.out.println("*** Non static *** ");
		SingleMultiCopies obj1 = new SingleMultiCopies();
		SingleMultiCopies obj2 = new SingleMultiCopies();
		System.out.println("Before obj1.x ="+obj1.x);
		obj1.x=500;
		System.out.println("After obj1.x ="+obj1.x);
		System.out.println("obj2.x ="+obj2.x);
		System.out.println("***** Static *****");
		System.out.println("Before obj1.a ="+obj1.a);
		obj1.a=1000;
		System.out.println("After obj1.a ="+obj1.a);
		System.out.println("obj.a ="+obj1.a);
		
		System.out.println("***** Program Ends*****");
		
		
		

	}


}
