package org.Day_24th_Constructor;

public class OnlyParaConEx {
	public  OnlyParaConEx(int a) {
		System.out.println("Parameter constructor Int a");
	}
	public  OnlyParaConEx(float b) {
		System.out.println("Parameter constructor Float b");
	}

	public static void main(String[] args) {
		OnlyParaConEx obj1 = new OnlyParaConEx(10);
		OnlyParaConEx obj2 = new OnlyParaConEx(30.5f);
		
	
		

	}

}
