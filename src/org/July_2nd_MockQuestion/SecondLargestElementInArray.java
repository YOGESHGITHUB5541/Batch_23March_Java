package org.July_2nd_MockQuestion;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int ar[]= {4,10,15,9,3,1};
		int max=ar[0];
		int secondmax=max;
	
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				
				secondmax=max;
				max=ar[i];		
			}
		}
		System.out.println("Second Highest Number = "+secondmax);


	}

}

