package org.Day_19th_Array;

public class TwoDArrayEx8 {

	public static void main(String[] args) {
	int [][] ar= new int [2][2];
	ar[0][0]=30;
	ar[0][1]=35;
	ar[1][0]=40;
	ar[1][1]=45;
	for(int i=0; i<ar.length;i++) {
		for(int j=0; j<ar.length;j++) {
			System.out.println("ar["+i+"]"+"["+j+"] ="+ar[i][j]);
		}
	}
	
		 
	}

}
