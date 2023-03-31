package org.Day_19th_Array;

public class TwoDArrayEx4 {

	public static void main(String[] args) {
		int ar [][] = {{12,23,44,45},{33,44,55,30},{88,66,77,5}};
		 
		 for(int i=0; i<ar.length; i++) {
			 for(int j=0; j<ar.length+1; j++) {
				 System.out.println("ar["+i+"] "+"["+j+"] ="+ar[i][j]);
			 }
		 }
		
		 
	}

}
