package org.July_2nd_MockQuestion;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int [] ar = {1,3,4,5,6,7};
		int sum1=0;
		for(int i=0; i<ar.length; i++) {
			sum1=sum1+ar[i];
		}
		int sum2=0;
		for(int i=0; i<=7; i++) {
			sum2=sum2+i;
		}
		System.out.println("Missing Number in Array is ="+(sum2-sum1));

	}

}
