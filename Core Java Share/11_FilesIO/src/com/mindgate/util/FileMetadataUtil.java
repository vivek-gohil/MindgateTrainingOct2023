package com.mindgate.util;

import java.io.File;
import java.util.Date;

public class FileMetadataUtil {
	private File file;

	public FileMetadataUtil(File file) {
		this.file = file;
	}

	public void printMetadata() {
		if (file.exists()) {
			System.out.println("File Name = " + file.getName());
			System.out.println("Location = " + file.getAbsolutePath());
			System.out.println("Size = " + file.length() + " bytes");
			System.out.println("Can execute = " + file.canExecute());
			System.out.println("Can Read = " + file.canRead());
			System.out.println("Can Write = " + file.canWrite());
			Date date = new Date(file.lastModified());
			System.out.println("Last Modified Date = " + date);
		} else {
			System.out.println("File dose not exists");
			System.out.println("Please check file path!!");
		}
	}

}
