package com.jvcdp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BLOGPOST")
public class Blogpost {


	public Blogpost(Long id, String name, String category, String comments,
			String description, Date lastUpdated) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.comments = comments;
		this.description = description;
		this.lastUpdated = lastUpdated;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long id;
	String name;
	String category;
	String comments;
	String description;

	@Column(name ="LAST_UPDATED")
	Date lastUpdated;

	public Blogpost() { }

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
