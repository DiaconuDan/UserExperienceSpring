package com.dan.app.ws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "get user was called" ;
	}
}
