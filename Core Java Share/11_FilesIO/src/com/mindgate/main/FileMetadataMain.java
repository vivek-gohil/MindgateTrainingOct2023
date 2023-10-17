package com.mindgate.main;

import java.io.File;

import com.mindgate.util.FileMetadataUtil;

public class FileMetadataMain {
	public static void main(String[] args) {
		String path = "C:\\Vivek Gohil\\Training\\Core Java\\Mindgate\\Files\\Demo.txt";

		File file = new File(path);
		
		FileMetadataUtil fileMetadataUtil = new FileMetadataUtil(file);
		
		fileMetadataUtil.printMetadata();
	}
}
