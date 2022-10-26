package com.solera.forum2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solera.forum2.model.Post;
import com.solera.forum2.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepo;
	
	@Transactional
	public List<Post>  getAllPosts() {
		List<Post> allPosts = postRepo.findAll();
		System.out.println(allPosts);
		return allPosts;
	}
	
	@Transactional
	public Optional<Post> getOnePostsById(long id) {
		return postRepo.findById(id);
	}
	
	@Transactional
	public List<Post> getPostsByIdThread(long id) {
		
		List<Post> allPosts = postRepo.findAll();
		List<Post> allPostsId = new ArrayList<>();
		
		for(int i=0; i<allPosts.size(); i++) {
			if(allPosts.get(i).getThread().getIdThread() == id) {
				allPostsId.add(allPosts.get(i));
			}
		}
		
		System.out.println(allPostsId);
		return allPostsId;
	}
	
	@Transactional
	public Post createNewPost(Post post) {
		return postRepo.save(post);
	}
}
