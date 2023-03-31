package org.Day_27_StringHomework;
//Count Vowels in given String
public class CountVowels {
	public static void main(String[] args) {
		String str = "Vaibhav";
		char[] chars = str.toCharArray();
		
		int count = 0;
		
		for(char c : chars) {
			switch(c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count ++;
			//	break;
			//	default :
			}
		}
		System.out.println("number of vowels in string ="+count);
	}

}
