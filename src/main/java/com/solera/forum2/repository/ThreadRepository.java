package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solera.forum2.model.ThreadForum;

public interface ThreadRepository extends JpaRepository<ThreadForum, Long>{

}
