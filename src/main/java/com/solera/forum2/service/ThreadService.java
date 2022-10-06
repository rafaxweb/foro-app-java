package com.solera.forum2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.forum2.model.ThreadForum;
import com.solera.forum2.repository.ThreadRepository;

@Service
public class ThreadService {
	
	@Autowired
	private ThreadRepository threadRepository;
	
	public List<ThreadForum> listAllThreads() 
	{
		return threadRepository.findAll();
	}
}
