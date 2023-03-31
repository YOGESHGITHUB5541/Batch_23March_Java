package org.Day_9th_ReturnValue;

public class Ex2 {
	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		//int ans = obj.average(10,20,30);
		//System.out.println("avg1 ="+ans);
		obj.average(10,20,30);

	}
	public void average(int a, int b , int c) {
		int avg=(a+b+c)/3;
		System.out.println("Average ="+avg);
	}
}



