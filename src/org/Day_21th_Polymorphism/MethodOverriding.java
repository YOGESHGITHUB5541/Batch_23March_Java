package org.Day_21th_Polymorphism;

class Parent{
	public void addition() {
		System.out.println("Addition");
	}
	public void addition1() {
		System.out.println("Addition1"); //implement
	}
	public void addition2() {
		System.out.println("Addition2");
	}
}

public class MethodOverriding extends Parent{
	public  void addition() {
		System.out.println("implement Addition");
	}
	public void addition1() {
		System.out.println("implement Addition1");
	}
	public void addition2() {
		System.out.println("implement Addition2");
	}

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.addition();
		obj.addition1();
		obj.addition2();
		
	}

}
