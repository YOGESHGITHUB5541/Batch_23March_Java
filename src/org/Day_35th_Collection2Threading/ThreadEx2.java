package org.Day_35th_Collection2Threading;

public class ThreadEx2 implements Runnable {
	public static void main(String[] args) throws InterruptedException {
	System.out.println("Program Start");
	ThreadEx2 obj = new ThreadEx2();
	Thread tr = new Thread(obj);
	tr.start();
	//Thread.sleep(5000);
	for(int i=0; i<5; i++) {
		System.out.println("Value of i ="+i);
	}
	System.out.println("Program ends");
	
	}
	public void run() {
		System.out.println("Run method starts");
		for(int k=0;k<5;k++) {
			System.out.println("Value of k ="+k);
		}
		System.out.println("Run method Ends");
	}

}
