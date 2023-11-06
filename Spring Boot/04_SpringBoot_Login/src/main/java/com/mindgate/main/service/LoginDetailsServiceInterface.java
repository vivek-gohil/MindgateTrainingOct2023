package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.LoginDetails;

public interface LoginDetailsServiceInterface {
	LoginDetails getLoginDetailsByLoginId(LoginDetails loginDetails);

	List<LoginDetails> getAllLoginDetails();

	List<LoginDetails> getAllLoginDetailsByStatus(boolean status);

	LoginDetails updateLoginDetails(LoginDetails loginDetails);
}
