package org.Day_26_Interface;
interface Inter1{
    public int addition(int a, int b);
	public int substraction(int a, int b);
	}
interface Inter2{
	public int division(int a, int b);
	public int multiplication(int a, int b);
}
class Parent1{
	public void test() {
		System.out.println("Parent class Test 1");
	}

	}


public class MultipleInheritance extends Parent1 implements Inter1, Inter2{
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.substraction(30, 40));
		System.out.println(obj.division(40, 10));
		System.out.println(obj.multiplication(5, 10));
		obj.test();
		
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		return a-b;
	}

}
