package org.Day_19th_Array;

public class TwoDArrayEx5 {

	public static void main(String[] args) {
		int [][] ar = {{12,33,44},{15,66,78}};
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length+1; j++) {
				System.out.println("ar["+i+"]" + "["+j+"] ="+ar[i][j]);
			}
		}
		 System.out.println(ar.length);
	}

}
