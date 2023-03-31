package org.Day_15th_PalindromNumber;

public class Ex2 {
	public static void main(String[]args) {
		int num=544,rev=0,rem=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("Number is Palindrom number");
		}else {
			System.out.println("Number is not Palindrom number");
		}
		
		
		
	}
	

}
