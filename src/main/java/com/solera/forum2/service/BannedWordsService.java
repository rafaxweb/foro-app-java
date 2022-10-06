package com.solera.forum2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.forum2.model.BannedWords;
import com.solera.forum2.repository.BannedWordsRepository;

@Service
public class BannedWordsService {

	@Autowired
	private BannedWordsRepository bannedWordsRepository;
	
	public List<BannedWords> findAllBannedWords() {
		return bannedWordsRepository.findAll();
	}
	
}
