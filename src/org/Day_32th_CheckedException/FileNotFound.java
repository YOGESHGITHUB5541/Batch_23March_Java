package org.Day_32th_CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) throws FileNotFoundException {
	FileReader f = new FileReader("Text.txt");
	}

}
