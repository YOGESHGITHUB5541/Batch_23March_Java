package org.Day_12th_NestedForLoop;

public class StarPatternEx9 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(" *");
			}
			for(int m=3;m>=i;m--) {
				System.out.print(" *");
			}
			System.out.println();



		}
	}
}
