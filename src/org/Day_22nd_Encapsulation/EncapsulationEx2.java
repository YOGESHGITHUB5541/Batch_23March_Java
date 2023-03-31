package org.Day_22nd_Encapsulation;
class Ex2{
	private int a=30, b=20;
	public int getA() {
		return a+b;
	}
	public int setA(int b) {
		return a=b;
	}
}
public class EncapsulationEx2 {
	public static void main(String[] args) {
		Ex2 obj = new  Ex2();
		int a= obj.getA();
		 System.out.println(a);
		 
		 int b= obj.setA(30);
		 System.out.println(b);
		
		
	}

}
