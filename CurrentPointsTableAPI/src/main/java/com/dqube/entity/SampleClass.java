package com.dqube.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Sample")
@Component
public class SampleClass implements Serializable  {
	
	private static final long serialVersionUID = 3736454973675520702L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String SampleData;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSampleData() {
		return SampleData;
	}
	public void setSampleData(String sampleData) {
		SampleData = sampleData;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
