package com.mindgate.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
	private File file;
	private FileWriter fileWriter;

	public FileWriterUtil(File file) {
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeFile(String data) {
		try {
			fileWriter.write(data);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
