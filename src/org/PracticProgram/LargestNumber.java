package org.PracticProgram;

public class LargestNumber {

	public static void main(String[] args) {
		int  [] ar = {1,2,3,16,8,9,50};
		int max =ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println(max);

	}

}
