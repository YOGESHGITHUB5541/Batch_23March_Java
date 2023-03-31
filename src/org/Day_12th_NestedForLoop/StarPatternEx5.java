package org.Day_12th_NestedForLoop;

public class StarPatternEx5 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("  "); //two space in string
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* "); //one star and space
			}
			System.out.println();  //for next line



		}
	}
}
