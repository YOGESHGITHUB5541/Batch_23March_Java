package org.ImportantProgram;

public class PalindromNumber {
	public static void main(String[] args) {
		int num=131, rev=0, rem=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(num==rev) {
			System.out.println("Number is Palindrom");
		}else {
			System.out.println("Number is Not Palindrom");
		}
			

	}

}
