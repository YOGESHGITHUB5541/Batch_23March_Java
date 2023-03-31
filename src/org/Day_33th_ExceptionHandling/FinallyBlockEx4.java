package org.Day_33th_ExceptionHandling;
//try and finally bloc only
public class FinallyBlockEx4 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			int a =10/0;
			System.out.println("Ans is ="+a);
		}finally {
			System.out.println("Finally block executed");
		}
		System.out.println("program Ends");

	}

}
