package com.mindgate.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("squareapi")
public class SquareController {

	@RequestMapping(value = "/{number}", method = RequestMethod.GET)
	public int calculateSquare(@PathVariable int number) {
		return number * number;
	}
}
