package org.Day_19th_Array;

public class Array1DMethodEx1 {

	public static void main(String[] args) {
		Array1DMethodEx1 obj = new Array1DMethodEx1();
		obj.test();
		

	}
	public int [] test() {
		int ar [] = {22,45,67,80};
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		return ar;
	}


}
