package org.Day_15th_ReverseNumber;

public class ReverseNumberEx3 {

	public static void main(String[] args) {
		int num=94504, rem=0, rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is ="+rev);
	}

}
