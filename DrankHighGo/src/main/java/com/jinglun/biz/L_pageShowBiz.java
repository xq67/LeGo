package com.jinglun.biz;

import java.util.List;
import java.util.Map;

import com.jinglun.entity.DrankB;

public interface L_pageShowBiz {
	//获取lego首页数据信息
	public Map<String, Object> getPageShow();
	//通过id获取详情页默认信息
	public Map<String, Object> findDBInfoById(Integer id);
	////获取热销产品1,//获取推荐产品2
	public List<DrankB> findHotDB(Integer dbpro);
}
