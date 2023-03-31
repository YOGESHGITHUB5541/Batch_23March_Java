package org.ImportantProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153, rev=0, rem=0;
		int temp=num;      //37
		while(temp>0) {
			rem=temp%10;    //370/10 =0 
			rev=rev+rem*rem*rem; //0=0+
			temp=temp/10;	
		}
		if(num==rev) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is Not Armstrong");
		}

	}

}
