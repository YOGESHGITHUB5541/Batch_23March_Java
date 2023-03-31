package org.Day_19th_Array;

public class Array2DoddNumber2 {
	public static void main(String[]args) {
		int ar[][] = {{11,12,45},{5,10,20},{44,37,9}};
		for(int i=0; i<ar.length;i++) {
			for(int j=0; j<ar.length;j++) {
				if(ar[i][j]%2!=0) {
					System.out.println("Odd Number ="+ar[i][j]);
					
				}
			}
		}
	}
}


