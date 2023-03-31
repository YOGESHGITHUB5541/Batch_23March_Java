package org.PracticProgram;

public class PrimeNumber1To10 {

	public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		int a=0;
		for(int j=2; j<=i-1; j++) {
			if(i%j==0) {
				a=a+1;
			}
		}
		if(a==0 && i!=1) {
			System.out.println(i);
		}
	}
	}

}
