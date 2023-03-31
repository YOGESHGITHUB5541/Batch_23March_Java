package org.Day_33th_ExceptionHandling;

import java.util.Scanner;

public class ScannerEx {  
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scn.next();
		System.out.println("String ="+str);
		
	    System.out.println("Enter int");
		int i=scn.nextInt();
		System.out.println("Int ="+i);
		
		System.out.println("Enter long");
		long l=scn.nextLong();
		System.out.println("Long ="+l);
		
		System.out.println("Enter Boolean");
		boolean b=scn.nextBoolean();
		System.out.println("Boolean ="+b);
		
		System.out.println("Enter Float");
		float f=scn.nextFloat();
		System.out.println("Float ="+f);
		
		System.out.println("Enter Double");
		double d=scn.nextDouble();
		System.out.println("Double ="+d);
		
		System.out.println("Enter Short");
		short s=scn.nextShort();
		System.out.println("Short ="+s);
		scn.close();
	}

}
