package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.solera.forum2.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query( value = "select * from user t where t.username = ?1", nativeQuery = true)
	User findUserByUsername(String username); 
}
