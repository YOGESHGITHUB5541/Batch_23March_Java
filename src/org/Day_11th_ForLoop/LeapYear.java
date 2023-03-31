package org.Day_11th_ForLoop;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2100;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("year is leap");
				}else{
					System.out.println("year is not leap");
				}
			}
			System.out.println("Year is Leap");
		}else {
			System.out.println("Year is not Leap");
		}

	}
}

