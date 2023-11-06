package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.LoginDetails;

public interface LoginDetailsRepositoryInterface {
	LoginDetails getLoginDetailsByLoginId(LoginDetails loginDetails);

	List<LoginDetails> getAllLoginDetails();

	List<LoginDetails> getAllLoginDetailsByStatus(boolean status);

	LoginDetails updateLoginDetails(LoginDetails loginDetails);
}
