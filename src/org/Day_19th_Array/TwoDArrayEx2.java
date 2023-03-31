package org.Day_19th_Array;

public class TwoDArrayEx2 {

	public static void main(String[] args) {
		
		int ar[][] = new int [3][3];
		 ar[0][0] =12;
		 ar[0][1] =33;
		 ar[0][2] =44;
		 
		 
		 ar[1][0] =33;
		 ar[1][1] =55;
		 ar[1][2] =88;
		 
		 ar[2][0] =65;
		 ar[2][1] =44;
		 ar[2][2] =23;
		 
		 for(int i=0; i<3; i++) {
			 for(int j=0; j<3; j++) {
				 System.out.println("ar["+i+"] "+"["+j+"] ="+ar[i][j]);
			 }
		 }
		
		 
	}

}
