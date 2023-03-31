package org.Day_22nd_Encapsulation;

class classB{
	private int a=10, b=20;
	public int getA () { //getter method 
		return a;	
	}
	public int getB() { //getter method
		return b;
	}
}

public class EncapsulationEx5 {
	public static void main(String[] args) {
		classB obj = new classB();
		System.out.println("** Program Starts **");
		int a= obj.getA();
		System.out.println("a = "+a);
		int b= obj.getB();
		System.out.println("b = "+b);
		
		int sum= obj.getA()+obj.getB();
		System.out.println("sum = "+sum);
		System.out.println("** Program Ends **");

	
		
	}

}
