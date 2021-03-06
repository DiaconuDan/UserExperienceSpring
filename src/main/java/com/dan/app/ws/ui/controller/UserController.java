package com.dan.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dan.app.ws.service.UserService;
import com.dan.app.ws.shared.dto.UserDto;
import com.dan.app.ws.ui.model.request.UserDetailsRequestModel;
import com.dan.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService ;
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		UserDto userDto = new UserDto() ;
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createdUser = userService.createUser(userDto);
		
		UserRest returnValue = new UserRest() ;
		BeanUtils.copyProperties(createdUser,returnValue);
		
		return returnValue ;
		
	}

	@GetMapping
	public String getUser() {
		return "sal";
	}
}
