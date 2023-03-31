package org.Day_9th_ReturnValue;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		int [] ar = {10,45,50,37,67,45};
		
		for (int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.println("Duplicate No is ="+ar[j]);
					
				}
			}
		}
		 
	}

}
