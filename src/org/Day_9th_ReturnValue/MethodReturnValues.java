package org.Day_9th_ReturnValue;

public class MethodReturnValues {
	public static void main(String[]args) {
		MethodReturnValues obj = new MethodReturnValues();
		int a=30, b=20;
		System.out.println("sumvar1 ="+obj.sum(a, b));
		int ans = obj.sum(a, b);
		System.out.println("sum var2 ="+ans);
		obj.sum(50, 60);
	}
public int sum(int x,int y) {
	
	int sumvar =x+y;
	System.out.println("sum var3 ="+sumvar);
	return sumvar;
	
}
}
