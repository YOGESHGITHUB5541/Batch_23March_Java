package org.Day_33th_ExceptionHandling;

public class MultiCatchBlock {
	public static void main(String[] args) {
		try {
			int a= 10/0;
			System.out.println("value of a is ="+a);
			
			String str = "Hello";
			System.out.println("Char at index 7 is ="+str.charAt(a));
			
			int [] ar = {10,20,30};
			System.out.println("int Array index 4 is ="+ar[4]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
