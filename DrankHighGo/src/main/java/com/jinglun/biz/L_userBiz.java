package com.jinglun.biz;

import java.util.List;

import com.jinglun.entity.User;

public interface L_userBiz {
	//获取所有的用户名
	public List<String> getAllNames();
	//验证用户(用户输入用户名或手机号)
	public User validateUser(String uname,String upwd);
	//注册用户
	public int registerUser(String phone,String pwd);
}
