package com.solera.forum2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<ThreadForum>> retrieveThreads() {
		return new ResponseEntity<List<ThreadForum>>(threadService.listAllThreads(), HttpStatus.FOUND);
	}
	
	@PostMapping("/new")
	public ResponseEntity<ThreadForum> createNewThread(@RequestBody ThreadForum thread) {
		return new ResponseEntity<ThreadForum>(threadService.saveNewThread(thread), HttpStatus.CREATED);
	}
	

}
