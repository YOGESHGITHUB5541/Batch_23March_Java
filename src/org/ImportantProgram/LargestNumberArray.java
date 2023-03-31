package org.ImportantProgram;

public class LargestNumberArray {

	public static void main(String[] args) {
		int [] ar = {21,45,100,90,50,30,80}; 
		int max = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max)
				max = ar[i];
		}
		System.out.println("Largest Number is ="+max);
	}

}






