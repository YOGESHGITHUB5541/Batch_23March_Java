package org.Day_4th_TypeCasting;

public class Ex2 {
	public static void main(String []args) {
		byte a=10; //byte to short
		short b=a; //implicitly widening small to big value
		System.out.println("a ="+b);
		
		short c=20; //short to byte
		byte d=(byte)c;//Explicitly narrowing big to small value
		System.out.println("d ="+d);
		
		short e=30; //short to integer
		int f=e; //implicitly widening small to big value
		System.out.println("e ="+f);
		
		int g=40; //integer to short
		short h=(short)g; //Explicitly narrowing big to small value
		System.out.println("g ="+g);
		
		int i=50; //Integer to long
		long j=i; //implicitly widening small to big value
		System.out.println("j ="+j);
		
		long k=60; //long to integer
		int l=(short)k; //Explicitly narrowing big to small value
		System.out.println("l ="+l);
		
		long m=70;
		float n=m;
		System.out.println("n ="+n);
		
		float o=80;
		long p=(long)o;
		System.out.println("p ="+p);
		
		float q=90.5f;
		double r=q;
		System.out.println("r ="+r);
		
		double s=100;
		float t=(float)s;
		System.out.println("t ="+t);

		
	}

}
