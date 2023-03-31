package org.Day_19th_Array;

public class Array2DMethodEx2 {

	public static void main(String[] args) {
		Array2DMethodEx2 obj = new Array2DMethodEx2();
		
		char ch[][] = obj.test1();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.println(ch[i][j]);
			}
		}
		
	
	}
	public char[][] test1() {
		char ch1[][]= {{'A','B','C'},{'D','F'}};
		return ch1;
		
	}

}
