package com.solera.forum2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.Post;

@RestController
@RequestMapping("/thread/")
public class ThreadController {

	@GetMapping("threads")
	public void retrieveThreads() {
		
	}
	
	@PostMapping("threads/new")
	public void createNewThread(@RequestBody Thread thread) {
		System.out.println(thread);
	}
	
	@GetMapping("posts")
	public void retrievePosts() {
		
	}
	
	@GetMapping("posts/new")
	public void createNewPosts(@RequestBody Post post) {
		
	}
}
