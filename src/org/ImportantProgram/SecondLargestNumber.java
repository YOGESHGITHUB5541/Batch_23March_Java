package org.ImportantProgram;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int [] ar = {10,20,45,25,30,40,50};
		int max =0;
		int secondmax = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				secondmax=max;
				max=ar[i];
				
			}else if (ar[i]>secondmax) {
				secondmax=ar[i];
				
			}
		}
		System.out.println("Second Largest number in Array : "+secondmax);
	}

}
