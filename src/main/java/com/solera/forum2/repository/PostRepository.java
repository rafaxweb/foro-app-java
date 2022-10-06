package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solera.forum2.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	
}
