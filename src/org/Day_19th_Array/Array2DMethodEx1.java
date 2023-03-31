package org.Day_19th_Array;

public class Array2DMethodEx1 {

	public static void main(String[] args) {
		Array2DMethodEx1 obj = new Array2DMethodEx1();
		obj.test();
		

	}
	public int [][] test() {
		int ar [][] = {{22,45,67,56},{10,33,56,43}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) 
			System.out.println(ar[i][j]);
		}
		System.out.println("Length ="+ar.length);
		return ar;
	}


}
