package org.ImportantProgram;

public class DuplicateChar {
	public static void main(String[]args) { 
		String str = "Vaibhav";  
		char [] ar = str.toCharArray();
		for (int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) 
					System.out.println("Duplicate character is = "+ar[j]);
				}
			}
		}	
	}    



