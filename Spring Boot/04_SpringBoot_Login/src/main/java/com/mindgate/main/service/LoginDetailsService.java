package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.repository.LoginDetailsRepositoryInterface;

@Service
public class LoginDetailsService implements LoginDetailsServiceInterface {

	@Autowired
	LoginDetailsRepositoryInterface loginDetailsRepositoryInterface;

	@Override
	public LoginDetails getLoginDetailsByLoginId(LoginDetails loginDetails) {
		LoginDetails existingLoginDetails = loginDetailsRepositoryInterface.getLoginDetailsByLoginId(loginDetails);
		if (existingLoginDetails != null) {
			if (existingLoginDetails.getPassword().equals(loginDetails.getPassword())
					&& existingLoginDetails.getLoginCount() < 3 && existingLoginDetails.isLoginStatus()) {
				existingLoginDetails.setPassword("");
				return existingLoginDetails;
			} else {
				if (existingLoginDetails.getLoginCount() < 2) {
					existingLoginDetails.setLoginCount(existingLoginDetails.getLoginCount() + 1);
					updateLoginDetails(existingLoginDetails);
					existingLoginDetails.setPassword("");
					existingLoginDetails.setRole("");
					existingLoginDetails.setUserName("");
					return existingLoginDetails;
				} else {
					existingLoginDetails.setLoginCount(existingLoginDetails.getLoginCount() + 1);
					existingLoginDetails.setLoginStatus(false);
					updateLoginDetails(existingLoginDetails);
					existingLoginDetails.setPassword("");
					existingLoginDetails.setPassword("");
					existingLoginDetails.setRole("");
					existingLoginDetails.setUserName("");
					return existingLoginDetails;
				}
			}
		}
		return loginDetails;
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		return loginDetailsRepositoryInterface.getAllLoginDetails();
	}

	@Override
	public LoginDetails updateLoginDetails(LoginDetails loginDetails) {
		return loginDetailsRepositoryInterface.updateLoginDetails(loginDetails);
	}

	@Override
	public List<LoginDetails> getAllLoginDetailsByStatus(boolean status) {
		return loginDetailsRepositoryInterface.getAllLoginDetailsByStatus(status);
	}

}
