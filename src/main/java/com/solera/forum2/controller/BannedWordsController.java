package com.solera.forum2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.BannedWords;
import com.solera.forum2.service.BannedWordsService;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("banned-words")
public class BannedWordsController {

	@Autowired
	BannedWordsService bannedWordsService;
	
	@GetMapping("/get")
	public ResponseEntity<List<BannedWords>> retrieveBannedWords() {
		return new ResponseEntity<List<BannedWords>>(bannedWordsService.findAllBannedWords(), HttpStatus.ACCEPTED);
	}
}
