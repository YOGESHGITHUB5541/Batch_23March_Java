package org.ImportantProgram;

public class UpperAndLowerLetters {

	public static void main(String[] args) {
		String str = "VaiBhaV";
		int upper =0;
		int lower =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				upper++;
			}else {
				lower++;
			}
			
		}
		System.out.println(upper);
		System.out.println(lower);
		
	}

}
