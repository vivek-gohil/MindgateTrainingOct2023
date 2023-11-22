package com.borntocode.main.repository;

import java.util.stream.Stream;

import com.borntocode.main.domain.FileDetails;

public interface FileDetailsRepositoryInterface {
	boolean addNewFile(FileDetails fileDetails);

	FileDetails getFileByFileId(int id);

	Stream<FileDetails> getAllFiles();
}
