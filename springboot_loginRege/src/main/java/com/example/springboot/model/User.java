package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userid;
	private String password;
	private String imagelink;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userid, String password, String imagelink) {
		super();
		this.id = id;
		this.userid = userid;
		this.password = password;
		this.imagelink = imagelink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", password=" + password + ", imagelink=" + imagelink + "]";
	}

	
}
