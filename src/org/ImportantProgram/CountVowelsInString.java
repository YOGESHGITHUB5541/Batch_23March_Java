package org.ImportantProgram;

public class CountVowelsInString {
	public static void main (String[]args){
		String str ="Buitiful";
		char [] chars =str.toCharArray();
		int count = 0;
		for(char c : chars){
			switch(c){
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