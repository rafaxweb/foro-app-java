package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.solera.forum2.model.UserForum;

public interface UserRepository extends JpaRepository<UserForum, Long>{
	
	@Query( value = "select * from user t where t.username = ?1", nativeQuery = true)
	UserForum findUserByUsername(String username); 
}
