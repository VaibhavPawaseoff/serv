package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Projects extends BaseEntity {

	private String projects;
	private String topic;
	

	public Projects(String projects, String topic) {
		super();
		this.projects = projects;
		this.topic = topic;
	}


	@Override
	public String toString() {
		return "Projects [projects=" + projects + ", topic=" + topic + "]";
	}
	
	
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	
}
