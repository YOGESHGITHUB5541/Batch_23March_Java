package org.ImportantProgram;

public class SpecialCharAndFindNumber {

	public static void main(String[] args) {
		String str = "!@V#a$$#i45@$*b&&h*#a%35@v#!";
		char[] chars = str.toCharArray();
		for(char c:chars) {
			if(Character.isDigit(c)) {
				System.out.print(c);
			}
		}
	}
}


