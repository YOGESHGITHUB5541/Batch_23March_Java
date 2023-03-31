package org.Day_5th_TypeCasting;

public class Homework {

	public static void main(String[] args) {
		int k=10;
		int n=20;
		int sum=(k+n);
		long sum1=n+k;     //addition
		System.out.println("sum ="+sum);
		
		float f=50;
		float f1=60;
		float multipication=(f*f1);
		double multiplication1=f*f1;   //multiplication
		System.out.println("multipication ="+multiplication1);
		
		short s=100;
		short s1=80;
		short subtraction=(short)(s-s1);
		int subtraction1=s-s1;    //subtraction
		System.out.println("subtraction ="+subtraction);
		
		byte o=120;
		byte p=100;
		byte Average=(byte)((o+p)/2);
		int Average1=((o+p)/2);
		System.out.println("Average ="+Average);
		
		
		
		
		float a=37;//celcious
		float b;// farhenhiet
		b =(float)((a*9)/5)+32;
		System.out.println("farhenhite ="+b);
		
				
		float P=1000;
		float R=5;
		float T=12 , si;
		si=(P*R*T)/100;
		System.out.println("Simple Interest ="+si);
		
		
		float r=5;
		float Area=(3.14f*r*r);
		System.out.println("Area Of Circle ="+Area);
		
	}

}
