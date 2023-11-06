package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.LoginDetails;

public class LoginDetailsRowMapper implements RowMapper<LoginDetails> {

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int loginId = rs.getInt("login_id");
		String password = rs.getString("password");
		String userName = rs.getString("user_name");
		String role = rs.getString("role");
		int loginCount = rs.getInt("login_count");
		boolean loginStatus = rs.getBoolean("login_status");

		LoginDetails loginDetails = new LoginDetails(loginId, password, userName, role, loginCount, loginStatus);

		return loginDetails;
	}

}
