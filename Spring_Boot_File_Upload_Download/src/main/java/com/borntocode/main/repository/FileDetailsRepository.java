package com.borntocode.main.repository;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.borntocode.main.domain.FileDetails;

@Repository
public class FileDetailsRepository implements FileDetailsRepositoryInterface {

	private static final String INSERT_NEW_FILE_DETAILS = "INSERT INTO FILE_DETAILS VALUES(FILE_DETAILS_SEQUENCE.NEXTVAL,?,?,?)";
	private static final String GET_FILE_BY_FILE_ID = "SELECT * FROM FILE_DETAILS WHERE ID = ?";
	private static final String GET_ALL_FILES = "SELECT * FROM FILE_DETAILS";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addNewFile(FileDetails fileDetails) {
		Object args[] = { fileDetails.getName(), fileDetails.getType(), fileDetails.getData() };
		int count = jdbcTemplate.update(INSERT_NEW_FILE_DETAILS, args);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public FileDetails getFileByFileId(int id) {
		return jdbcTemplate.queryForObject(GET_FILE_BY_FILE_ID, new FileDetailsRowMapper(), id);
	}

	@Override
	public Stream<FileDetails> getAllFiles() {
		return jdbcTemplate.queryForStream(GET_ALL_FILES, new FileDetailsRowMapper());
	}

}
