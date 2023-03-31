package org.Day_33th_ExceptionHandling;
//Example of finally when Exception is not occur
public class FinallyBlockEx3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			int a =10/5;
			System.out.println("Ans is ="+a);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block executed");
		}
		System.out.println("program Ends");

	}

}
