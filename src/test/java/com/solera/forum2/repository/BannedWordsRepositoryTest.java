package com.solera.forum2.repository;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;

import com.solera.forum2.TestConfiguration;
import com.solera.forum2.model.BannedWords;

@RunWith(SpringRunner.class)
@ContextConfiguration (
  classes = { TestConfiguration.class }, 
		  loader = AnnotationConfigContextLoader.class)
@Transactional
@SpringBootTest
public class BannedWordsRepositoryTest {

	@Resource
	@Autowired
	BannedWordsRepository repo;
	
	@Test
	public void givenUser_WhenSaveUser_ReturnUserSavedById() {
		BannedWords banned = new BannedWords(Long.valueOf(1), "banned");
		
		repo.save(banned);
		
		Optional<BannedWords> actualBannedWord = repo.findById(Long.valueOf(1));
		BannedWords expectedBannedWord = new BannedWords(Long.valueOf(1), "banned");
		
		Assert.assertEquals(actualBannedWord.get().getWord(), expectedBannedWord.getWord());
	}
}
