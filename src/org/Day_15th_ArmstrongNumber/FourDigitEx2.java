package org.Day_15th_ArmstrongNumber;

public class FourDigitEx2 {

	public static void main(String[] args) {
		int num=1634, rev=0, rem=0;
		int temp =num;
		while(num>0) {
			rem =num%10;
			rev =rev+rem*rem*rem*rem;
			num =num/10;
		}
		if(rev==temp) {
			System.out.println("Number is Armstrong number");
		}else {
			System.out.println("Number is not Armstrong Number");
		}
	

	}

}
