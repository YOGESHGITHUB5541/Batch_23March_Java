package org.Day_9th_ReturnValue;

public class Ex3 {
	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		int c=8, d=9;
		obj.sum(c , d);
		obj.sum(10,20);
		obj.subtraction(20, 30);
		obj.multiplication(40, 50);
		
	}
	
	public int sum(int a, int b) {
		
		int sum=a+b;
		System.out.println("Sum ="+sum);
		return sum;
		}
	public int subtraction(int a,int b) {
		int subtraction=a-b;
		System.out.println("Subtraction ="+subtraction);
		return subtraction;
	}
	public int multiplication(int a,int b) {
		int multiplication=a*b;
		System.out.println("Multiplication ="+multiplication);
		return multiplication;
    }
	public int division(int a,int b) {
		int division=a/b;
		System.out.println("Division ="+division);
		return division;
}
}



