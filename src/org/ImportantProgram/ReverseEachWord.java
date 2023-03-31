package org.ImportantProgram;

public class ReverseEachWord {

	public static void main(String[] args) {
	String str ="There is a gardern";
	String rev="";
	char [] ar =str.toCharArray();
	for(int i=ar.length-1; i>=0; i--) {
		rev=rev+ar[i]+"";
	}
	System.out.println(rev);

	}

}
