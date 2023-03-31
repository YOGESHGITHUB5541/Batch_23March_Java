package org.ImportantProgram;

public class OddAndEvenNum {

	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Odd Number");
		for(int i=0; i<ar.length; i++) {
			if(i%2==0)
				System.out.println(ar[i]);
		}
		System.out.println("Even Number");
		for(int j=0; j<ar.length; j++) {
			if(j%2!=0)
				System.out.println(ar[j]);
		}

	}

}
