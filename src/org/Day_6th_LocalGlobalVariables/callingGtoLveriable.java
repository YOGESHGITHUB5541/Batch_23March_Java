package org.Day_6th_LocalGlobalVariables;

public class callingGtoLveriable {
	int a=50; //global
	public static void main(String[]args) {
		int b=60; //local
		callingGtoLveriable obj = new callingGtoLveriable();
		System.out.println("sum ="+(obj.a+b));//sum of one local variable and one global variable
	}

}
