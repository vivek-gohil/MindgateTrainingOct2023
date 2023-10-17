package com.mindgate.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
	private File file;
	private FileReader fileReader;
	private char[] data = new char[2000];
	
	public FileReaderUtil(File file) {
		this.file = file;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Invalid File Path");
			System.out.println(e.getMessage());
		}
	}

	public void printFileData() {
		try {
			fileReader.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (char c : data) {
			System.out.print(c);
		}
	}
}







