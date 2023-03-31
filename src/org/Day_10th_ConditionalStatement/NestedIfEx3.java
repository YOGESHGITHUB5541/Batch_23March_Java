package org.Day_10th_ConditionalStatement;

public class NestedIfEx3 {
	public static void main(String[] args) {
		int num=6;
		if(num>0) {
			if(num<10) {
				System.out.println("number is between 0 to 10");
				if(num%2==0){
					System.out.println("number is even");
				}else {
					System.out.println("number is odd");
				}
			}else{
				System.out.println("number is not between 0 to 10.number is greater than 10");

			}
		}else {
			System.out.println("number is not between 0 or 1.It is less than zero");
		}
	}
}


