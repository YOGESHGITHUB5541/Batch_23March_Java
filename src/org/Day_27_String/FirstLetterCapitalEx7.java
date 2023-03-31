package org.Day_27_String;

public class FirstLetterCapitalEx7 {
	public static void main(String[] args) {
		String str ="there is a gArdEn and it is beaUtIful";
		str = str.toLowerCase();
		String[] str1 =str.split(" ");
		String ans1 = "";
		for(int i=0; i<str1.length;i++) {
			String FirstLetter = str1[i].substring(0, 1).toUpperCase();
			String Remainigpart = str1[i].substring(1, str1[i].length());
			
			String ans = FirstLetter+Remainigpart;
			ans1=ans1+" "+ans;
			
			
			
			
	  // ans1=ans1 +" "+str1[i].substring(0, 1).toUpperCase()
//			+str1[i].substring(1,str1[i].length());
		}
		System.out.println(ans1);
	}

}
