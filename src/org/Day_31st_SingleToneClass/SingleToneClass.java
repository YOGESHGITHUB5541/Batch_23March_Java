package org.Day_31st_SingleToneClass;

class SingleT{
	private static SingleT obj = new SingleT(); //creating object only once
	
	private SingleT() { 
		//private constructor restricting users from creating new object in other class
	}
	public static SingleT getobject() {
		return obj;
		
	}
	public void display() {
		System.out.println("Display method in singleT");
	}
}
public class SingleToneClass {
	public static void main(String[] args) {
		SingleT obj = SingleT.getobject();
		obj.display();

	}

}
