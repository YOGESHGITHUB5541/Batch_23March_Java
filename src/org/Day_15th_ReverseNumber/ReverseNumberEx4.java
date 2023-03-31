package org.Day_15th_ReverseNumber;

public class ReverseNumberEx4 {
	public static void main(String[] args) {
		int num=3456, rev=0, rem=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is ="+rev);
	}
}	