package org.Day_27_String;
//split the sentence after .
public class SplitMethodDot {

	public static void main(String[] args) {
		String str="There is a garden. sd sd sdf";
		String[] str1 = str.split("\\.", 2);
		for(int i=0; i<str1.length;i++) {
			System.out.println(str1[i]);
		}

	}

}
