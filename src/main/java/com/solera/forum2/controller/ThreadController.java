package com.solera.forum2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.ThreadForum;
import com.solera.forum2.service.ThreadService;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/threads")
public class ThreadController {

	@Autowired
	private ThreadService threadService;
	
	@GetMapping("/list")
	public List<ThreadForum> retrieveThreads() {
		return threadService.listAllThreads();
	}
	
	@PostMapping("/new")
	public void createNewThread(@RequestBody ThreadForum thread) {
		System.out.println(thread.getTitle());
	}
	

}
