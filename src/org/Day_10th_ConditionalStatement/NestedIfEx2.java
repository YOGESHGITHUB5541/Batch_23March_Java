package org.Day_10th_ConditionalStatement;

public class NestedIfEx2 {
	public static void main(String[]args) {
		int age=19;
		int weight=51;
		if(age>=18) {
			if(weight>50) {
				System.out.println("You are eligibal to donate blood");
			}else{
					System.out.println("You are not eligibal donate blood");
				}
			}
			else{
				System.out.println("age is must be greater than 18");
			}
		}
	
	}
	


