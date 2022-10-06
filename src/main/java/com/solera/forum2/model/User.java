package com.solera.forum2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String profile_image;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<ThreadForum> threads;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileImage() {
		return profile_image;
	}

	public void setProfileImage(String profileImage) {
		this.profile_image = profileImage;
	}

	public List<ThreadForum> getThreads() {
		return threads;
	}

	public void setThreads(List<ThreadForum> threads) {
		this.threads = threads;
	}
	
}
