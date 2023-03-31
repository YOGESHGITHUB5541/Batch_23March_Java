package org.ImportantProgram;

public class Ex2 {

	public static void main(String[] args) {
		int [] ar = {0,1,0,1,0,1,0,1};
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(ar[i]==0 && ar[j]!=0) {
					System.out.println("["+ar[i]+"]"+"["+ar[j]+"]");
				}
			}
		}
	}

}
