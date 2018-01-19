package com.dqube.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Table(name="current_points")
@Component
@Entity
public class Current_Points {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String project_name;
	private String project_task;
	private String project_Id;
	private String task_Id;
	private String user_Id;
	private String user_name;
	private String points;
	private Date dateandtime;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
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
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public Date getDateandtime() {
		return dateandtime;
	}
	public void setDateandtime(Date dateandtime) {
		this.dateandtime = dateandtime;
	}
	

	
	
}
