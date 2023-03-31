package org.Day_27_String;
//addition of number in given string
public class StringAdditionEx9 {
	public static void main(String[] args) {
		String str= "agwf2bh3jkhg4bhgjyg6bhbjgh7"; ///2+3+4+6+7=22
		int sum=0;
		for(int i=0; i<str.length();i++) {
			char c =str.charAt(i);
			if(Character.isDigit(c)) {
				sum= sum + Integer.parseInt(String.valueOf(c));
			}
		}
        System.out.println("sum ="+sum);
	}

}
