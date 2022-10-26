package com.solera.forum2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.forum2.model.Post;
import com.solera.forum2.service.PostService;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("posts")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping("/get")
	public ResponseEntity<List<Post>> retrievePosts() {
		return new ResponseEntity<List<Post>>(postService.getAllPosts(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Post>> retrievePosts(@PathVariable Long id) {
		Optional<Post> post = postService.getOnePostsById(id);
		if (post.isEmpty()) {
			return new ResponseEntity<Optional<Post>>(postService.getOnePostsById(id), HttpStatus.NOT_FOUND);
		
		} else {			
			return new ResponseEntity<Optional<Post>>(postService.getOnePostsById(id), HttpStatus.FOUND);
		}
	}
	
	@GetMapping("/getPosts/{idThread}")
	public ResponseEntity<List<Post>> retrievePostsByIdThread(@PathVariable Long idThread) {
		return new ResponseEntity<List<Post>>(postService.getPostsByIdThread(idThread), HttpStatus.FOUND);
	}
	
	@PostMapping("/new")
	public ResponseEntity<Post> createNewPosts(@RequestBody Post post) {
		return new ResponseEntity<Post>(postService.createNewPost(post), HttpStatus.CREATED);
	}
}
