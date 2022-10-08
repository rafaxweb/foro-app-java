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
public class ThreadForum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idThread;

	@Column
	private String title;
	
	@Column
	private String image;

	@JsonIgnore
	@OneToMany(mappedBy = "thread")
	private List<Post> posts;
	
	@Column
	private Integer postsNumber;

	public long getIdThread() {
		return idThread;
	}

	public void setIdThread(long idThread) {
		this.idThread = idThread;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getPostsNumber() {
		return postsNumber;
	}

	public void setPostsNumber(Integer postsNumber) {
		this.postsNumber = postsNumber;
	}
}
