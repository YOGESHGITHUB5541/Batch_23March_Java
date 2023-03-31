package org.Day_13th_WhileDoWhile;

public class WhileLoopEx3 {
	public static void main(String[]args) {
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println("Even Number is ="+i);
			}else {
				System.out.println("Odd Number is ="+i);
			}
			i++;
		}
	}
}

