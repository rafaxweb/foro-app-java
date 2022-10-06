package com.solera.forum2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.solera.forum2.model.User;
import com.solera.forum2.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public String getOneUserByUsername(String username) {
		
		User user = userRepository.findUserByUsername(username);
		
		return user.getPassword();
		
	}
	
	@Transactional
	public String getOneUserByPassword(Long id) {
		
		Optional<User> user = userRepository.findById(id);
		
		System.out.println(user.get().getPassword());
		return user.get().getPassword();
	}
	
}
