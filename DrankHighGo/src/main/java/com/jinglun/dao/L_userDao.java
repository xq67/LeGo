package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.User;

public interface L_userDao {
	//验证用户(用户输入用户名或手机号)
	public User validateUser1(@Param("uname")String uname,@Param("upwd")String upwd);
	//验证用户(用户输入用户名或手机号)
	public User validateUser2(@Param("uphone")String uphone,@Param("upwd")String upwd);
	//注册用户
	public int registerUser(@Param("phone")String phone,@Param("pwd")String pwd);
	//获取所有的用户名
	public List<String> getAllNames();
}
