package org.Day_27_String;

public class StringEx8 {
	public static void main(String[] args) {
		String str ="ThEre is a gaRdEn and It is beAutIfUl";
		 str=str.toLowerCase(); //sentence is lower case and then split it
		
		String[] str1 =str.split(" ");
		String ans1 = "";
		for(int i=0; i<str1.length;i++) {
			
	   ans1=ans1 +" "+str1[i].substring(0, 1).toUpperCase()+str1[i].substring(1,str1[i].length());
		}
		System.out.println(ans1);
	}

}
