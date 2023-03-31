package org.July_2nd_MockQuestion;

public class LargestElementInArray {
	public static void main(String[] args) {
	int [] ar = {10,20,67,40,55};
	int max=ar[0];
	for(int i=0; i<ar.length; i++) {
		if(ar[i]>max)
			max=ar[i];
	}
	System.out.println("Largest Element in Array is = "+max);
	}

}
