package org.Day_20th_SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int [] ar = {99,55,88,10,30};
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		

	}

}
