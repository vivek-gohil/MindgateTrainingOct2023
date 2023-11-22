package com.borntocode.main.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borntocode.main.domain.FileDetails;
import com.borntocode.main.repository.FileDetailsRepositoryInterface;

@Service
public class FileDetailsService implements FileDetailsServiceInterface {

	@Autowired
	private FileDetailsRepositoryInterface fileDetailsRepositoryInterface;

	@Override
	public boolean addNewFile(FileDetails fileDetails) {
		return fileDetailsRepositoryInterface.addNewFile(fileDetails);
	}

	@Override
	public FileDetails getFileByFileId(int id) {
		return fileDetailsRepositoryInterface.getFileByFileId(id);
	}

	@Override
	public Stream<FileDetails> getAllFiles() {
		return fileDetailsRepositoryInterface.getAllFiles();
	}

}
