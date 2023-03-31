package org.Day_20th_SelectionSort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] ar = {99,55,88,10,30};
		for(int i=0; i<ar.length;i++) {
			for(int j=0; j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		
	}

}
