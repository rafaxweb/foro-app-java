package com.solera.forum2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/username/{id}")
	public String retrieveUserUsername(@PathVariable long id) {
		return userService.getOneUserByUsername(id);
	}

	@GetMapping("/password/{id}")
	public String retrieveUserPassword(@PathVariable long id) {
		return userService.getOneUserByPassword(id);
	}
	
}
