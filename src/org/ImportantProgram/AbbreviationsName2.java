package org.ImportantProgram;

public class AbbreviationsName2 {

	public static void main(String[] args) {
		String str ="Vaibhav Raosaheb Chore";
		            
		int last = str.lastIndexOf(' ');
		System.out.print(str.charAt(0)+".");
		for(int i=0; i<last; i++) {
			char ch = str.charAt(i);
			if(ch==' ')
				System.out.print(str.charAt(i+1)+".");
		}
		System.out.print(str.substring(last+1));

	}

}
