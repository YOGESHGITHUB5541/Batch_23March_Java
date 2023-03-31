package org.Day_9th_ReturnValue;

public class MethodReturnParaEx {
	public static void main(String[]args) {
		MethodReturnParaEx obj = new MethodReturnParaEx();
		obj.addition1(); // direct call addition1 method 
		
		int sum1 = obj.addition2(80, 90);//call addition2
		System.out.println("sum1 = "+sum1);
		obj.addition2(30,40);
		
		float sum2 = obj.addition3(55.11f, 66.22f);//call addition2
		System.out.println("sum2 = "+sum2);
		obj.addition3(10.10f, 20.40f);
		
		double sum3 = obj.addition3(77, 88);
		System.out.println("sum3 = "+sum3);
		obj.addition4(55,66);
		
		float sum4 = obj.divisionofsum(10.20f, 30,(short)10);
		System.out.println("div = "+sum4);
		obj.divisionofsum(10.20f, 30,(short) 10);

	}
	public  void addition1() {
		int a=10, b=20;
		System.out.println("sum = "+(a+b));
	}
	public int addition2(int a, int b) {
		return a+b;
	}
	public float addition3(float a, float b) {
		return (a+b);
	}
	public double addition4(double a, double b) {

		return (a+b);
	}
	public float divisionofsum(float z,int x,short y) {
		float sum = z+x+y;
		float div = sum/10;
		return div;
	}
}
