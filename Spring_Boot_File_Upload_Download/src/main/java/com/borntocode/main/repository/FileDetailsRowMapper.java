package com.borntocode.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.borntocode.main.domain.FileDetails;

public class FileDetailsRowMapper implements RowMapper<FileDetails> {
	@Override
	public FileDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		FileDetails fileDetails = new FileDetails();
		
		fileDetails.setId(rs.getInt("id"));
		fileDetails.setName(rs.getString("name"));
		fileDetails.setType(rs.getString("type"));
		fileDetails.setData(rs.getBytes("data"));
		return fileDetails;
	}
}
