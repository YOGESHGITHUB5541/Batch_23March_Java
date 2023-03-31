package org.Day_35th_Collection2Threading;

public class ThreadEx1 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		ThreadEx1 obj = new ThreadEx1();
		obj.start();;
		for(int i=0;i<5;i++) {
			System.out.println("Value of i ="+i);
		}
		System.out.println("Program Ends");

	}
	public void run() {
		System.out.println("Run method starts");
		for(int k=0; k<5;k++) {
			System.out.println("Value of K ="+k);
		}
		System.out.println("Run Method Ends");
	}

}
