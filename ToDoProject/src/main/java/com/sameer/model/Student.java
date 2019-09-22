package com.sameer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import java.time.format.DateTimeFormatter;  
//import java.time.LocalDateTime; 
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column
	private int taskId;
	@Column
	private String name;
	@Column
	private String task;
	@Column
	private String description;
	@Column
	private String date;

	public Student() {}
	
	public Student(int taskId, String name, String task, String description, String date) {
		super();
		this.taskId = taskId;
		this.name = name;
		this.task = task;
		this.description = description;
		this.date=date;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String gettask() {
		return task;
	}
	public void settask(String task) {
		this.task = task;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
