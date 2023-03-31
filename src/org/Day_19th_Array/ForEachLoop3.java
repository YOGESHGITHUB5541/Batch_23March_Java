package org.Day_19th_Array;

public class ForEachLoop3 {

	public static void main(String[] args) {
		int []ar = {3,8,9,10,4,7,1,2,3};
		for(int i=0; i<ar.length;i++) {
		
			if(i==0 || i==1 || i==2 || i==3 || i==4 || i==5 ) {
				continue;     
			}
			System.out.println(ar[i]);
		
		}
		System.out.println();
		for(int i=0; i<ar.length;i++) {
			
			if(i==0 || i==4 || i==5 || i==6 || i==7 || i==8 ) {
				continue;     
			}
			System.out.println(ar[i]);
		}
		
		

	}

}
//break and return is same break array size is break
// continue keyword is used for hide value of index