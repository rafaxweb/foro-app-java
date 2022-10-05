package com.solera.forum2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "forum")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPost;
		
	@Column
	private String description;
	
	@Column
	private Date date;

	@ManyToOne
	@JoinColumn(name="User", nullable=false)
	private Thread thread;
}
