package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.LoginDetails;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SELECT_ALL_LOGIN_DETAILS_BY_STATUS = "select * from login_details_spring_boot where login_status = ?";
	private static final String SELECT_ALL_LOGIN_DETAILS = "select * from login_details_spring_boot";
	private static final String SELECT_ONE_LOGIN_DETAILS = "select * from login_details_spring_boot where login_id = ?";
	private static final String UPDATE_LOGIN_DETAILS = "update login_details_spring_boot set password=? , user_name = ? , role = ? , login_count = ? , login_status = ? where login_id = ?";

	@Override
	public LoginDetails getLoginDetailsByLoginId(LoginDetails loginDetails) {
		LoginDetailsRowMapper loginDetailsRowMapper = new LoginDetailsRowMapper();

		LoginDetails existingLogin = jdbcTemplate.queryForObject(SELECT_ONE_LOGIN_DETAILS, loginDetailsRowMapper,
				loginDetails.getLoginId());
		if (existingLogin != null)
			return existingLogin;
		else
			return null;
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		return jdbcTemplate.query(SELECT_ALL_LOGIN_DETAILS, new LoginDetailsRowMapper());
	}

	@Override
	public LoginDetails updateLoginDetails(LoginDetails loginDetails) {
		System.out.println(loginDetails);
		Object[] parameters = { loginDetails.getPassword(), loginDetails.getUserName(), loginDetails.getRole(),
				loginDetails.getLoginCount(), loginDetails.isLoginStatus(), loginDetails.getLoginId() };

		if (getLoginDetailsByLoginId(loginDetails) != null) {
			int count = jdbcTemplate.update(UPDATE_LOGIN_DETAILS, parameters);
			if (count > 0)
				return loginDetails;
		}
		return null;
	}

	@Override
	public List<LoginDetails> getAllLoginDetailsByStatus(boolean status) {
		Object[] parameters = { status };
		return jdbcTemplate.query(SELECT_ALL_LOGIN_DETAILS_BY_STATUS, new LoginDetailsRowMapper(), parameters);
	}

}
