package org.Day_22nd_Encapsulation;
class Ex1{
	private int a=10;
	public int getA() {
		return a;
	}
	public void setA(int value) {
		a=value;

	}
}
public class EncapsulationEx1 {
	public static void main(String[] args) {
		Ex1 obj = new Ex1();
	    int a= obj.getA();
		System.out.println("value return a="+a);
		obj.setA(80);
	    int b = obj.getA();
		System.out.println("Value return b="+b);
		
		

	}

}
