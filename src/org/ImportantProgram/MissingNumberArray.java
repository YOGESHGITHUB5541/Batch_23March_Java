package org.ImportantProgram;

public class MissingNumberArray {

	public static void main(String[] args) {
	int [] ar = {1,2,3,4,5,7,8};      //30
	 int sum1 = 0;
	 for(int i=0; i<ar.length; i++) {
		 sum1 = sum1+ar[i];
	 }
 
	 int sum2 = 0;
	 for(int i=0; i<=8; i++) {  //36
		 sum2 = sum2+i;	
	 }
	 
	 System.out.println("Missing Number is ="+(sum2-sum1));
	 
	}

}


