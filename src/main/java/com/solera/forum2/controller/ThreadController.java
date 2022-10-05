package com.solera.forum2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.Post;
import com.solera.forum2.model.ThreadForum;

@RestController
@RequestMapping("/thread/")
public class ThreadController {

	@GetMapping("")
	public void retrieveThreads() {
		
	}
	
	@PostMapping("/new")
	public void createNewThread(@RequestBody ThreadForum thread) {
		System.out.println(thread.getTitle());
	}
	
	@GetMapping("posts")
	public void retrievePosts() {
		
	}
	
	@GetMapping("posts/new")
	public void createNewPosts(@RequestBody Post post) {
		
	}
}
