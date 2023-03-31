package org.Day_33th_ExceptionHandling;

public class TryAndCatch2 {
	public void test() {
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(Exception e){
		System.out.println("**** getMessage output ****");
	    System.out.println(e.getMessage());
		System.out.println("**** printStackTrace output ****");
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start Program");
		TryAndCatch2 obj = new TryAndCatch2();
		obj.test();
		System.out.println("Ends Program");
	}

}
