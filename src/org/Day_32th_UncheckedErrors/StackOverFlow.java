package org.Day_32th_UncheckedErrors;

public class StackOverFlow {
	public void test() {
		System.out.println("hello");
		test();
	}
	public static void main(String[] args) {
		StackOverFlow obj = new StackOverFlow();
		obj.test();

	}

}
