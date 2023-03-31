package org.Day_10th_ConditionalStatement;

public class IfElseIfLadderEx1 {
	public static void main (String[]args) {
		int marks=59;
		if(marks<=40)    //40<=40
		{
			System.out.println("Fail");
		}
		else if(marks<=50)
		{
			System.out.println("Pass");
		}
		else if(marks<=55)
		{
			System.out.println("Second Class");
		}
		else if(marks<=60)
		{
			System.out.println("Higher second Class");
		}
		else if(marks<=65) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Distinction");
		}
	
	}

}
