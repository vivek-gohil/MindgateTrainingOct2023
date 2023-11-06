package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.service.LoginDetailsServiceInterface;

@RestController
@RequestMapping("logindetailsapi")
@CrossOrigin("*")
public class LoginDetailsController {

	@Autowired
	private LoginDetailsServiceInterface loginDetailsServiceInterface;

	@RequestMapping(value = "logindetails", method = RequestMethod.GET)
	public List<LoginDetails> allLoginDetails() {
		return loginDetailsServiceInterface.getAllLoginDetails();
	}

	@RequestMapping(value = "inactive", method = RequestMethod.GET)
	public List<LoginDetails> allInactiveLoginDetails() {
		return loginDetailsServiceInterface.getAllLoginDetailsByStatus(false);
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public LoginDetails getOneLogin(@RequestBody LoginDetails loginDetails) {
		System.out.println(loginDetails);
		return loginDetailsServiceInterface.getLoginDetailsByLoginId(loginDetails);
	}

}
