package org.PracticProgram;

public class PrintOnlyName {

	public static void main(String[] args) {
		String str = "Vaibhav123";
		char [] ar = str.toCharArray();
		for(char c: ar) {
			if(Character.isLetter(c)) {
				System.out.print(c);
			}
			
		}
		
	}

}
