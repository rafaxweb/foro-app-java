package com.solera.forum2.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Date Date;

	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user;

	@JsonIgnore
	@OneToMany(mappedBy = "thread")
	private List<Post> posts;

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

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
