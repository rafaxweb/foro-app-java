package com.solera.forum2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.service.UserService;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/password/{username}")
	public String retrieveUserUsername(@PathVariable String username) {
		return userService.getOneUserByUsername(username);
	}
	
}
