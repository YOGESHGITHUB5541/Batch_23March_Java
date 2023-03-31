package org.Day_27_StringHomework;
//Count letter in string 
public class CountLetter {

	public static void main(String[] args) {
		String str="Let us fly the kite";
		int count = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)=='e') {
				count = count+1;
			}
		}
		System.out.println("count of letter 'e' ="+count);
		

	}

}
