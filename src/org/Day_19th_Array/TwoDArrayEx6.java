package org.Day_19th_Array;

public class TwoDArrayEx6 {

	public static void main(String[] args) {
		int [][] ar= new int [2][3];
		ar[0][0]=15;
		ar[0][1]=16;
		ar[0][2]=20;
		ar[1][0]=31;
		ar[1][1]=19;
		ar[1][2]=13;
		for(int i=0; i<ar.length;i++) {
			for(int j=0; j<ar.length+1;j++) {
				System.out.println(ar[i][j]);
			}
		}
		
	}

}
