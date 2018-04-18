package com.jinglun.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinglun.biz.L_pageShowBiz;
import com.jinglun.entity.DrankB;

@RestController
public class JsonController {
	@Resource
	L_pageShowBiz l_pageShowBiz;
	
	@RequestMapping("/pageshow")
	public Map<String, Object> showPage(){
		Map<String, Object> map=l_pageShowBiz.getPageShow();
		return map;
	}
	
	@RequestMapping("/db")//详情页-dbinfo-请求路径
	public Map<String, Object> DbInfo(Integer dbid){
		Map<String, Object> map=l_pageShowBiz.findDBInfoById(dbid);
		return map;
	}
	
	@RequestMapping("/hot")//推荐1或热销2
	public List<DrankB> DbHotInfo(Integer dbpro){
		List<DrankB>list=l_pageShowBiz.findHotDB(dbpro);
		return list;
	}
	@RequestMapping("/classify") //进入分类列表1
	public List<DrankB> ShowWineById(Integer id){
		List<DrankB>list=l_pageShowBiz.findDBByDaid(id);
		return list;
		
	}
	
}
