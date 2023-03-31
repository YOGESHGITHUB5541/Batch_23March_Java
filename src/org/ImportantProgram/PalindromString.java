package org.ImportantProgram;

public class PalindromString {

	public static void main(String[] args) {
	 String str = "dad";  //dad, madam, level,refer
	 int leng = str.length();
	 String rev = "";
	 for(int i=leng-1; i>=0; i--) {
		 rev = rev+str.charAt(i);
	 }
	 if(str.equals(rev)) {
		 System.out.println("Palindrom");
	 }else {
	 System.out.println("Not palindrom");

	}

}
}

