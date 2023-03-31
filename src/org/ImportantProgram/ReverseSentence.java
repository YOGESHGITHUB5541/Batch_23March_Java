package org.ImportantProgram;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Vaibhav Chore";
		String rev = "";
		String [] ar = str.split(" ");
		
		for(int i=ar.length-1; i>=0; i--) {
			rev = rev +ar[i]+" ";
			
		}
		System.out.println(rev);

	}

}
