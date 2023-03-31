package org.Day_26_Interface;

interface Interface2{
	public int test(int a, int b);
	public int test2(int a,int b);
	
}
public class ChildClass3 {
	public static void main(String[] args) {
		Interface2 obj = new Interface2() {
			public int test(int a, int b) {
				return a+b;
			}
			public int test2(int a, int b) {
				return a-b;
			}
		};
		System.out.println("test = "+obj.test(10, 20));
		System.out.println("test2 = "+obj.test2(50, 40));
	}

}
