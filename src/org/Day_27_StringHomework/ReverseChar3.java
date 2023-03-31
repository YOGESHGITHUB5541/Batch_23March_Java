package org.Day_27_StringHomework;

public class ReverseChar3 {

	public static void main(String[] args) {
		String str="Pritam";
		int leng= str.length();
		String rev ="";
		for(int i=leng-1; i>=0; i--) {
			rev = rev +str.charAt(i);
		}
		System.out.println(rev);
	
				
		}
		
		
	}

