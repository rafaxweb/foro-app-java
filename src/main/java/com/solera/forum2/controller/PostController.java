package com.solera.forum2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Post> retrievePosts() {
		return postService.getAllPosts();
	}

	@GetMapping("/get/{id}")
	public Optional<Post> retrievePosts(@PathVariable Long id) {
		return postService.getOnePostsById(id);
	}
	
	@GetMapping("/getPosts/{idThread}")
	public List<Post> retrievePostsByIdThread(@PathVariable Long idThread) {
		return postService.getPostsByIdThread(idThread);
	}
	
	@PostMapping("/new")
	public void createNewPosts(@RequestBody Post post) {
		postService.createNewPost(post);
	}
}
