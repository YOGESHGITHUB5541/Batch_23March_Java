package org.Day_13th_WhileDoWhile;

public class WhileEvenNumber {
	public static void main(String[]args) {
		int num =50;
		while(num<=70) {
			if(num%2==0) {
				System.out.println("Even Number ="+num);	
			}else {
				System.out.println("Odd number ="+num);
			}
			num++;
		}
	}

}
