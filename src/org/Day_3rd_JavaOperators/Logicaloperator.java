package org.Day_3rd_JavaOperators;

public class Logicaloperator {
	public static void main(String[]args) {
		int vaibhav=10;
		int sanket=20;
		System.out.println((vaibhav<sanket) && (vaibhav>sanket));
		
		
		//logical operator
		
		System.out.println((10>5) && (2>1)); //t
		System.out.println((10>5) && (2<1)); //f
		System.out.println((10<5) && (2<1)); //f
		System.out.println((10<5) && (2>1)); //f
		
		System.out.println();
		
		System.out.println((10>5) || (2>1)); //t
		System.out.println((10>5) || (2<1)); //t
		System.out.println((10<5) || (2<1)); //f
		System.out.println((10<5) || (2>1)); //t
		
		

	}
	

	}
	


