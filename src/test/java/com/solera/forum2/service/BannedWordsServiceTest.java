package com.solera.forum2.service;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.solera.forum2.TestConfiguration;
import com.solera.forum2.model.BannedWords;
import com.solera.forum2.repository.BannedWordsRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration (
  classes = { TestConfiguration.class }, 
		  loader = AnnotationConfigContextLoader.class)
@Transactional
@SpringBootTest
public class BannedWordsServiceTest {
	
	@Resource
	BannedWordsService service;
	
	@Resource
	BannedWordsRepository repository;
	
	@org.junit.jupiter.api.Test
	public void whenAddNewUser_ReturnNewUser() {
		
		repository.save(new BannedWords(Long.valueOf(1), "ban"));
		
		service.findAllBannedWords();
	}
}
