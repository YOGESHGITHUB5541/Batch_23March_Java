package org.Day_13th_WhileDoWhile;

public class DoWhileEvenOddEx3 {
	public static void main(String[]args) {
		int i=50;
		do {
			if(i%2!=0) {
				System.out.println("odd Number ="+i);
			}
			i++;
		}while(i<=70);

		int k=50;
		do {
			if(k%2==0) {
				System.out.println("Even Number ="+k);
			}
			k++;
		}while(k<=70);

	}
}
