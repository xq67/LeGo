package com.jinglun.entity;

import java.io.Serializable;

public class User implements Serializable{
	private String uname;
	private Integer uid;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
}
