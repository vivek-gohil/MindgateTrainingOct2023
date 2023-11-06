package com.mindgate.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("convertapi")
public class ConvertController {

	@RequestMapping(value = "lower/{text}", method = RequestMethod.GET)
	public String convertToLowerCase(@PathVariable String text) {
		return text.toLowerCase();
	}

	@RequestMapping(value = "upper/{text}", method = RequestMethod.GET)
	public String convertToUpperCase(@PathVariable String text) {
		return text.toUpperCase();
	}
}
