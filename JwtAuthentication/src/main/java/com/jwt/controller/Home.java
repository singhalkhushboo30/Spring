package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome() {
		String text="This is a home page.";
		text+="This page is not allowed to Unauthenticated user.";
		return text;
	}

}
