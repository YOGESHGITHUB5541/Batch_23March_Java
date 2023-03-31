package org.July_2nd_MockQuestion;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int [] ar = {1,2,3,4,2,5,6,7};
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.println("Duplicate Element in Array is ="+ar[j]);
				}
			}
		}
	}

}
