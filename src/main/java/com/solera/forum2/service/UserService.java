package com.solera.forum2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.solera.forum2.model.UserForum;
import com.solera.forum2.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public String getOneUserPasswordByUsername(String username) {
		UserForum user = userRepository.findUserByUsername(username);
		return user.getPassword();
		
	}
	
	@Transactional
	public String getOneUserPasswordById(Long id) {
		
		Optional<UserForum> user = userRepository.findById(id);
		
		System.out.println(user.get().getPassword());
		return user.get().getPassword();
	}
	
}
