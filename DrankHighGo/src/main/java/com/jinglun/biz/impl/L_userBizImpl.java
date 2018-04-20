package com.jinglun.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinglun.biz.L_userBiz;
import com.jinglun.dao.L_userDao;
import com.jinglun.entity.User;
@Service
public class L_userBizImpl implements L_userBiz {
	@Resource
	L_userDao l_userDao;
	@Override
	public List<String> getAllNames() {
		// TODO Auto-generated method stub
		return l_userDao.getAllNames();
	}

	@Override
	public User validateUser(String uxx, String upwd) {
		User user=null;
		user=l_userDao.validateUser1(uxx, upwd);    //名字匹配
		if(user==null){
			user=l_userDao.validateUser2(uxx, upwd);
		}
		return user;
	}

	@Override
	public int registerUser(String phone,String pwd) {
		// TODO Auto-generated method stub
		return l_userDao.registerUser(phone, pwd);
	}

	

}
