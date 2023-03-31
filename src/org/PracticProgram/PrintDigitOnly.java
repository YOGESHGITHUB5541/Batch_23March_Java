package org.PracticProgram;

public class PrintDigitOnly {

	public static void main(String[] args) {
	String str = "Vaibhav@#$%^&1234";
	char [] ar = str.toCharArray();
	for(char c: ar) {
		if(Character.isDigit(c)) {
			System.out.print(c);
		}
	}
	}

}
