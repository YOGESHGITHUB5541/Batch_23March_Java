package org.ImportantProgram;

public class SecondHighestEx {
	public static void main(String[] args) {
		int ar[] = {20,10,30,50,40};
		
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(i);
//		}
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			if(i==1) {
				break;
			}
		}
		System.out.println("Second Highest : "+ar[1]);

	}

}
