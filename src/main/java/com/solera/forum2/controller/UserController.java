package com.solera.forum2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> retrieveUserPassword(@PathVariable String username) {
		String user = userService.getOneUserPasswordByUsername(username);
		if (user==null) {
			return new ResponseEntity<String>(user, HttpStatus.NOT_FOUND);
		
		} else {
			return new ResponseEntity<String>(user, HttpStatus.FOUND);			
		}
	}
	
}
