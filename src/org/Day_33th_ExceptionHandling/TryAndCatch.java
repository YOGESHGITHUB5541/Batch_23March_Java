package org.Day_33th_ExceptionHandling;

public class TryAndCatch {
	public void test() {
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("Program start");
		TryAndCatch obj = new TryAndCatch();
		obj.test();
		System.out.println("Program Ends");

	}

}
