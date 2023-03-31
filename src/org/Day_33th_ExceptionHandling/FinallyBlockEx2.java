package org.Day_33th_ExceptionHandling;
//Example of Finally Bloc Return Keyword is used
public class FinallyBlockEx2 {
	public void test() {
		System.out.println("Test Method Starts");
		try {
			int a=10/5;
			System.out.println("Ans is ="+a);
			return;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally Block Excecuted");
		}
		System.out.println("Test Method Ends");
}
	public static void main(String[] args) {
		System.out.println("Program starts");
		FinallyBlockEx2 obj = new FinallyBlockEx2();
		obj.test();
		System.out.println("Program Ends");
		
}
}