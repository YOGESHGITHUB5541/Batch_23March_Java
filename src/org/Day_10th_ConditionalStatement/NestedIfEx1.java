package org.Day_10th_ConditionalStatement;

public class NestedIfEx1 {
	public static void main(String[] args) {
		int marks = 45;
		if (marks >= 35) {
			if (marks >= 50) {
				if (marks >= 60) {
					if (marks >= 65) {
						System.out.println("Distiction");
					} else {
						System.out.println("first class");
					}
				} else {
					System.out.println("second class");
				}
			} else {
				System.out.println("pass");
			}
		} else {
			System.out.println("fail");
			
		}
	}
}









