package com.dqube.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="poke")
public class PokeTableEntity implements Serializable {

	
	private static final long serialVersionUID = -3995030136687460243L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String user_id;
	String poke_user_id;
	boolean inbound;
	boolean outbound;
	Date date_time;
	
	//Getter and Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPoke_user_id() {
		return poke_user_id;
	}
	public void setPoke_user_id(String poke_user_id) {
		this.poke_user_id = poke_user_id;
	}
	public boolean isInbound() {
		return inbound;
	}
	public void setInbound(boolean inbound) {
		this.inbound = inbound;
	}
	public boolean isOutbound() {
		return outbound;
	}
	public void setOutbound(boolean outbound) {
		this.outbound = outbound;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
