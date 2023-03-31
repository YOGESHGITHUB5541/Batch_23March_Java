package org.ImportantProgram;

public class smallestNumberArray {

	public static void main(String[] args) {
		int [] ar = {20,30,9,40,2,100,78}; 
		int min = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i]<min)
				min = ar[i];
		}
		System.out.println("Smallest Number is ="+min);
	}

}
