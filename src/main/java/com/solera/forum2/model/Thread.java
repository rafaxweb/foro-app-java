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

@Entity
@Table(name = "forum")
public class Thread {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idThread;
		
	@Column
	private String title;
	
	@Column
	private Date Date;
	
	@ManyToOne
	@JoinColumn(name="idUser", nullable=false)
	private User user;
		
	@Column
	@OneToMany(mappedBy = "thread")
	private List<Post> posts;
}
