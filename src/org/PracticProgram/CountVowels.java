package org.PracticProgram;

public class CountVowels {

	public static void main(String[] args) {
		String str ="Vaibhav";
		int count =0;
		char [] ar = str.toCharArray();
		for(char c: ar) {
			switch(c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
			}
		}
		System.out.println(count);
	}

}
