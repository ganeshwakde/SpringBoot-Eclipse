package com.example.demo.coursearea;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.example.demo.topicarea.Topic;

@Entity
public class Course {

	@Id
	private int id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	

	public Course(int id, String name, String description, Integer topicid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicid, "", "");
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
