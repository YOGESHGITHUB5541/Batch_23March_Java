package org.Day_33th_ExceptionHandling;

public class ThrowEx1 {
	public static void main(String[] args) {
		ThrowEx1 obj = new ThrowEx1();
		obj.printStudentDetails("vaibhav", 17);
		
	}
	public void printStudentDetails(String name,int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age for college admission");
		}else {
			System.out.println("Name of Student is = "+name);
			System.out.println("Age of student is = "+age);
		}
	}

}
