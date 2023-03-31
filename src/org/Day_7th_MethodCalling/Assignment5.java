package org.Day_7th_MethodCalling;

public class Assignment5 {
	public static void main(String[] args) {
		Assignment5 obj = new Assignment5();
		obj.SimpleInterest(30000,13.5,6);
	}
	
	public int SimpleInterest(int p, double r,int t) {
		int SI=(int)(p*r*t/100);
		System.out.println("SI ="+SI);
		return SI;
		}
}
