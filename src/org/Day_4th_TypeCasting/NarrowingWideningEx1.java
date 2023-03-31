package org.Day_4th_TypeCasting;

public class NarrowingWideningEx1 {

	public static void main(String[] args) {
		int a = 50;
		byte b = (byte)a; // Explicitly Narrowing
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		double d1 =b; //Implicitly Widening
		double d2 =b; //explicitly
		System.out.println("d1 ="+d1);
		System.out.println("d2 ="+d2);
		
		short s=500;
		short s1=(short)a;
		short s2=b;
		System.out.println("s1 ="+s);
		System.out.println("s2 ="+s1);
		
		long l=1000; 
		float f=l; //implicitly
		System.out.println("f ="+l);
		
		float f1=50.45f; 
		long l1=(long)f1;//explicitly
		System.out.println("l1 ="+f1);
		
		
		
	}

}
