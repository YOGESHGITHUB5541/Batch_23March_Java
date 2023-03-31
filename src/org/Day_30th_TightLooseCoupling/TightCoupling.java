package org.Day_30th_TightLooseCoupling;
class Parent23{
	public Parent23(int x, int y) {
		System.out.println("Default Const");
	}
	public void test() {
		System.out.println("Parent23 Test");
	}
}
public class TightCoupling extends Parent23 {
	public TightCoupling(int x, int y) {
		super(x, y);
		
	}

	public void test() {
		System.out.println("Parent23 Test");
	}

	public static void main(String[] args) {
		TightCoupling obj = new TightCoupling(10,20);
		obj.test();

	}

}
