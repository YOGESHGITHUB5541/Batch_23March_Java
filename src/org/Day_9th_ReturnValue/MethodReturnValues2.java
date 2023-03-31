package org.Day_9th_ReturnValue;

public class MethodReturnValues2 {
	public static void main(String[]args) {
		MethodReturnValues2 obj = new MethodReturnValues2();
		int a=30, b=20;

		int ans = obj.sum(1,2);

		obj.sum(50, 60);
	}
	public int sum(int x,int y) {

		int sumvar =x+y;
		System.out.println("sum var3 ="+sumvar);
		return sumvar;

	}
}
