package org.PracticProgram;

public class DuplicateCharInString {

	public static void main(String[] args) {
	String str = "vaibhav";
	char[] ar=str.toCharArray();
	for(int i=0; i<ar.length;i++) {
		for(int j=i+1; j<ar.length; j++) {
			if(ar[i]==ar[j]) {
				System.out.println("Duplicat char in string = "+ar[j]);
			}
		}
	}
	}

}
