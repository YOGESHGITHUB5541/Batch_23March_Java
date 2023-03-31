package org.Day_19th_Array;

public class ForEachLoop2 {

	public static void main(String[] args) {
		int []ar = {12,33,13,55,78};
		for(int i=0; i<ar.length;i++) {
			//System.out.println(ar[i]);
			if(i==2) {        // hide value of index 3 =55
				break;    //Continue break return keyword 
			}
			System.out.println(ar[i]);
		}
		
		

	}

}
//break and return is same break array size is break
// continue keyword is used for hide value of index