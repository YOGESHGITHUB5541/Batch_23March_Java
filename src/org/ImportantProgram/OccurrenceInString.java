package org.ImportantProgram;

public class OccurrenceInString {
	public static void main(String[] args) {
		String str= "It is a buitiful garden tttt";
		int count =0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)=='t') {
				count=count+1;
			}
		}
		System.out.println("Count of letter 'i' is ="+count);
	}
}