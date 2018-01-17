package com.dqube.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Current_Points")
public class EntityClass implements Serializable{

	private static final long serialVersionUID = -7025661151588547047L;

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer Id;
	
	@Column
	String project_name;
	
	@Column
	String project_task;
	
	@Column
	String project_Id;
	
	@Column
	String task_Id;
	
	@Column
	String user_Id;
	
	@Column
	String user_name;
	
	@Column
	String dateandtime;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_task() {
		return project_task;
	}

	public void setProject_task(String project_task) {
		this.project_task = project_task;
	}

	public String getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(String project_Id) {
		this.project_Id = project_Id;
	}

	public String getTask_Id() {
		return task_Id;
	}

	public void setTask_Id(String task_Id) {
		this.task_Id = task_Id;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}