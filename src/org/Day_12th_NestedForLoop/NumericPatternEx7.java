package org.Day_12th_NestedForLoop;

public class NumericPatternEx7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
