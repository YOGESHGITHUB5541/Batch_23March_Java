package org.Day_19th_Array;

public class TwoDArrayEx1 {

	public static void main(String[] args) {
		
		int ar[][] = new int [4][3];
		 ar[0][0] =12;
		 ar[0][1] =13;
		 ar[0][2] =14;
		
		 ar[1][0] =33;
		 ar[1][1] =55;  
		 ar[1][2] =89;
		 ar[2][1] =70;
		 
		 ar[2][0] =65;
		 ar[2][1] =44;
		 ar[2][2] =23;
		 
		 ar[3][0] =65;
		 ar[3][1] =44;
		 ar[3][2] =23;
		 
		 for(int i=0; i<ar.length; i++) {
			 for(int j=0; j<ar.length-1; j++) {
				 if(ar[i][j]%2!=0) {
					 System.out.println(ar[i][j]);	 
			 
		 }else {
			 System.out.println(ar[i][j]);
		 }
		
		 
	}

}
	}}
