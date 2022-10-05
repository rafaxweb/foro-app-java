package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solera.forum2.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
