package org.PracticProgram;

public class SmallestNumber {

	public static void main(String[] args) {
		int [] ar = {10,4,8,9,2,50};
		int min =ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println(min);
	}

}
