package org.Day_24th_Abstraction;
abstract class Ex9{
	abstract public void test1 ();
	abstract public void test2();
	public void test3() {
		System.out.println("Test 3");
	}
	public void test4() {
		System.out.println("Test 4");
	}
}
    
public abstract class AbstractEx6 extends Ex1 {

	public static void main(String[]args) {
		Ex9 obj = new Ex9() {
			public void test1() {
				System.out.println("test1");
			}
			public void test2() {
				System.out.println("test2");
			}
		};
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}

}
