package org.Day_9th_ReturnValue;

public class Parameter {

	public static void main(String[] args) {
		Parameter obj = new Parameter();
//		int a=21, b=31;
//		System.out.println("Vaibhav ="+obj.add(a, b));
		obj.add(10, 30);
		obj.add(12, 13);
		obj.add(14, 15);
		obj.add(16, 17);
	}
	public int add(int a, int b) {
		int sum= a+b;
		System.out.println("Addition ="+sum);
		return sum;
	}
	


}
