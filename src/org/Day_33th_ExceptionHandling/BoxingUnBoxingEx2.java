package org.Day_33th_ExceptionHandling;

public class BoxingUnBoxingEx2 {
	public static void main(String[] args) {
		//converting string to int and integer object
		String s = "500";
		int x2 = Integer.parseInt(s);
		int x3 = Integer.valueOf(s); 
		System.out.println(x2);
		System.out.println(x3);
		
		//converting int to string
		int a = 100;
		String str = String.valueOf(a);
		System.out.println(str);

	}

}
