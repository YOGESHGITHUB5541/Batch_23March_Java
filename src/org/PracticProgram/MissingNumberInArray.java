package org.PracticProgram;

public class MissingNumberInArray {

	public static void main(String[] args) {
	int [] ar = {1,2,3,4,6,7,8};
	int sum1=0;
	for(int i=0; i<ar.length; i++) {
		sum1=sum1+ar[i];
	}
	int sum2=0;
	for(int j=0; j<=8; j++) {
		sum2=sum2+j;
	}
	System.out.println(sum2-sum1);
	}

}
