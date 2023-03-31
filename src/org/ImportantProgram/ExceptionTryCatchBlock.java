package org.ImportantProgram;

import org.Day_32th_UnCheckedException.ArithmaticException;

public class ExceptionTryCatchBlock {

	public static void main(String[] args) {
		try {
			int y=10/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
