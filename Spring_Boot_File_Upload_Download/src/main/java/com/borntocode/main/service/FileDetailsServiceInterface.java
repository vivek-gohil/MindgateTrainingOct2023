package com.borntocode.main.service;

import java.util.stream.Stream;

import com.borntocode.main.domain.FileDetails;

public interface FileDetailsServiceInterface {
	boolean addNewFile(FileDetails fileDetails);

	FileDetails getFileByFileId(int id);

	Stream<FileDetails> getAllFiles();
}
