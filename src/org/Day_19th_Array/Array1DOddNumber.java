package org.Day_19th_Array;

public class Array1DOddNumber {
	public static void main(String[]args) {
		int ar[] = {12,33,45,66,71,5,7};
		for(int i=0; i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.println("Odd number ="+ar[i]);
			}
		}
	}

}
