package com.solera.forum2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.BannedWords;
import com.solera.forum2.service.BannedWordsService;

@RestController
@RequestMapping("banned-words")
public class BannedWordsController {

	@Autowired
	BannedWordsService bannedWordsService;
	
	@GetMapping("/get")
	public List<BannedWords> retrieveBannedWords() {
		return bannedWordsService.findAllBannedWords();
	}
}
