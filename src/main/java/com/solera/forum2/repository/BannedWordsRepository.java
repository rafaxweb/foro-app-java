package com.solera.forum2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solera.forum2.model.BannedWords;

public interface BannedWordsRepository extends JpaRepository<BannedWords, Long> {

}
